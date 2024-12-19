// User and recipe data simulation
const users = {}; // Stores user credentials
let loggedInUser = null;
const posts = []; // Stores recipe posts

// Utility functions
function showPage(pageId) {
    document.querySelectorAll(".page").forEach(page => page.classList.add("hidden"));
    document.getElementById(pageId).classList.remove("hidden");
}

function displayPosts() {
    const postsContainer = document.getElementById("posts");
    postsContainer.innerHTML = posts
        .map(post => `
            <div class="post">
                <img src="${post.image}" alt="Recipe Image">
                <h3>${post.title}</h3>
                <p>${post.caption}</p>
                <p><strong>Ingredients:</strong> ${post.ingredients}</p>
                <p><strong>Cooking Time:</strong> ${post.cookingTime}</p>
            </div>
        `)
        .join("");
}

// Switch between Login and Register pages
document.querySelectorAll("#switch-auth").forEach(switchAuth => {
    switchAuth.addEventListener("click", function () {
        if (document.getElementById("login-page").classList.contains("hidden")) {
            showPage("login-page");
        } else {
            showPage("register-page");
        }
    });
});

// Register functionality
document.getElementById("register-form").addEventListener("submit", function (e) {
    e.preventDefault();
    const username = document.getElementById("register-username").value;
    const password = document.getElementById("register-password").value;

    if (users[username]) {
        document.getElementById("register-error").textContent = "Username already exists.";
        document.getElementById("register-success").textContent = "";
    } else {
        users[username] = password;
        document.getElementById("register-error").textContent = "";
        document.getElementById("register-success").textContent = "Registration successful! You can now log in.";
        document.getElementById("register-username").value = "";
        document.getElementById("register-password").value = "";
    }
});

// Login functionality
document.getElementById("login-form").addEventListener("submit", function (e) {
    e.preventDefault();
    const username = document.getElementById("login-username").value;
    const password = document.getElementById("login-password").value;

    if (users[username] && users[username] === password) {
        loggedInUser = username;
        document.getElementById("login-error").textContent = "";
        showPage("upload-page"); // Redirect to upload page after login
    } else {
        document.getElementById("login-error").textContent = "Incorrect username or password.";
    }
});

// Upload functionality (for recipe post upload)
document.getElementById("upload-form").addEventListener("submit", function (e) {
    e.preventDefault();
    const imageInput = document.getElementById("image");
    const title = document.getElementById("title").value;
    const caption = document.getElementById("caption").value;
    const ingredients = document.getElementById("ingredients").value;
    const cookingTime = document.getElementById("cooking-time").value;

    if (imageInput.files.length > 0) {
        const reader = new FileReader();
        reader.onload = function (e) {
            posts.push({
                image: e.target.result,
                title: title,
                caption: caption,
                ingredients: ingredients,
                cookingTime: cookingTime
            });
            displayPosts(); // Display new post after upload
        };
        reader.readAsDataURL(imageInput.files[0]);
    }

    imageInput.value = "";
    document.getElementById("title").value = "";
    document.getElementById("caption").value = "";
    document.getElementById("ingredients").value = "";
    document.getElementById("cooking-time").value = "";
});

// Navigate to Profile Page
document.getElementById("go-to-profile").addEventListener("click", function () {
    document.getElementById("welcome-message").textContent = `Hello, ${loggedInUser}`;
    showPage("profile-page");
});

// Logout functionality
document.getElementById("logout").addEventListener("click", function () {
    loggedInUser = null;
    showPage("login-page");
});
