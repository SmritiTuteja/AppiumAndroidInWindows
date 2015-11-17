# Mobile Automation using Appium in Windows
This repo contains details of how to kick start Mobile Automation using Appium in Windows.

## Prerequisites:
1. JAVA JDK - http://www.oracle.com/technetwork/java/javase/downloads/index.html
    * Set environment variable JAVA_HOME under 'System variables': ![set java-home](https://cloud.githubusercontent.com/assets/5630557/11218999/05bae080-8d7e-11e5-8994-cdfb10b21149.PNG)
2. Android SDK - https://developer.android.com/sdk/index.html [Note: Appium supports Android API >=17]
     * Set environment variable ANDROID_HOME under 'System variables': ![set android-home](https://cloud.githubusercontent.com/assets/5630557/11219003/0865b774-8d7e-11e5-8a80-cd623ef7983f.PNG)
3. Node.js - https://nodejs.org/en/download/. Then run following commands on cmd:
    * npm install -g appium      #get appium
    * npm install wd    #get appium client
    * appium-doctor     #check if everything is correctly set
4. Appium.exe (zip file) (for Appium Inspector) - https://bitbucket.org/appium/appium.app/downloads/
5. Apache Maven (zip file) - https://maven.apache.org/download.cgi
     * Set environment variable M2_HOME under 'System variables': ![set maven-home](https://cloud.githubusercontent.com/assets/5630557/11219006/0a353890-8d7e-11e5-8172-201b86314250.PNG)
6. Any IDE: Eclipse - https://www.eclipse.org/downloads/
7. Add all the environment variables set(in steps 1,2 and 5) along with platform-tools and npm(node package manager)path to PATH variable:
So, your PATH variable would look something like:
C:\Windows\System32;%JAVA_HOME%\bin;%ANDROID_HOME%\bin;%M2_HOME%\bin;C:\Users\Administrator\AppData\Local\Android\android-sdk\platform-tools;C:\Program Files\nodejs\node_modules\npm\bin;
![set path variable](https://cloud.githubusercontent.com/assets/5630557/11219010/0dfa59ce-8d7e-11e5-9c01-78f230b25126.PNG)


## Executing a Basic Script 
### Create a Sample Project:
1. Launch Eclipse. Click on File -> New -> Other -> Maven project.
2. Select workspace and archetype-quickstart.
3. Provide Group and Artifact ID.
4. Click 'Finish'.
5. Add Appium Java Client Dependency: You can add appium java client dependency (which is a java language binding for writing Apiium tests) in pom.xml as - ![java_client_dependency](https://cloud.githubusercontent.com/assets/5630557/11219634/78a02a44-8d81-11e5-893b-59c7abd59554.PNG)

### Desired Capabilities: 
1. DEVICE_NAME: The kind of mobile device or emulator to use (Android Emulator, Nexus 5 etc.)
2. APP_PACKAGE: Java package of the Android app you want to run(say- com.example.android.myApp)
3. APP_ACTIVITY: Activity name for the Android activity you want to launch from your package(MainActivity, .Settings etc.)
All other Appium capabilties details can be found here - https://github.com/appium/appium/blob/master/docs/en/writing-running-appium/caps.md

### Launch Appium and Run Scripts:
1. Launch Appium Server:  appium &
2. Run scripts
3. To View element id's : Launch Appium Inspector
   



