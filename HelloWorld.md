## Developing a "Hello World" Spigot plugin with Intellij for a Minecraft 1.14.4 Server

###Installing required software and dependencies**
- Installing Java Runtime
    - From the Oracle website, download and install the latest version of the Java runtime (Version 8 Update 221 at the time of writing).
    https://www.java.com/en/download/windows-64bit.jsp
- Installing Git Bash
    - From the Git website, download and install the latest version of Git (Version 2.22.0 at the time of writing)
    https://git-scm.com/downloads
- Installing JDK
    - From the Oracle website, download and install the latest version of JDK/JSE (12.0.2 at the time of writing).
    https://www.oracle.com/technetwork/java/javase/downloads/index.html
- Installing Intellij
    - From the Jetbrains website, download and install the latest version of the Jetbrains Toolbox.
    https://www.jetbrains.com/toolbox/
    - Once installed, use it to install the latest version of Intellij.
    - Alternatively, download and install the latest version of Intellij by itself.

### Setting up a test server

This test server will only be used by you, locally, for development and testing purposes. There is no need to port forward the server or allow access to it by anyone else.

- Building Spigot
    - Download the latest BuildTools.jar from the Spigot website.
    https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar
    - Place the BuildTools.jar into a new directory where you will be building the jars.
    - Open up Git Bash and navigate to that directory.
    - Execute the following command:
        ```
        Java -jar BuildTools.jar --rev 1.14.4
        ```
        - This will take a few minutes as it builds the 1.14.4 version of the spigot jar.
- Starting the server
    - Place the newly created spigot-1.14.4.jar file into a separate folder where you will be running the server from.
    - Create a new text file in the directory with the following contents:
        ```
        @echo off
        java -Xms1G -Xmx1G -XX:+UseConcMarkSweepGC -jar spigot.jar
        pause
        ```
        - Name this file "start.bat"
    - Double click the file to execute the script
        - This will create a few new files in the directory related to running the test server, including a file called "eula.txt". When instructed by the output from the script, open the "eula.txt" file and change "false" to "true". Save and close the file. Once this is finished, re-run the "start.bat" script. This will create a few more files and start up the server.
        - You can then open up Minecraft, go to Multiplayer, Direct Connect, and enter in "localhost". This will connect you to your new test server.
        
    
### Setting up your environment
- Cloning the repo
- Configuring the repo with intellij and the dependencies
