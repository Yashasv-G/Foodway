This is the first page of a multi-feature web app where users can register and log in. It’s built using Java Servlets, JSP, and Maven and is designed to be simple and functional. Once logged in, users will eventually access a page to share their food recipes with photos and videos, and interact with others by liking and sharing content.

Tech Stack:
Java Servlets for backend
JSP for frontend
Maven for project management
Apache Tomcat as the web server

Requirements:
Java JDK 8+
Apache Maven
Eclipse IDE with Maven and Tomcat plugins
Apache Tomcat server 9+


Setup and Run:

Clone the Repository


Copy code
https://github.com/Yashasv-G/Foodway/tree/main
Import into Eclipse: Open Eclipse and import the project as an existing Maven project.

Configure Tomcat: Add Tomcat under Window > Preferences > Server > Runtime Environments.

Run the Application: Right-click the project, select Run on Server, and choose Tomcat. Go to http://localhost:8080/LoginRegisterApp/index.jsp in your browser.

Current Features (Phase 1)
Register: Users can sign up with a username and password.
Login: Registered users can log in, and session management will remember them.
Next Steps (Phase 2)
In the next phase, I’ll add a community page where users can:

Post food recipes with photos and videos
Like and share each other’s posts
