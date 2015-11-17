# Mobile Automation using Appium in Windows
This repo contains details of how to kick start Mobile Automation using Appium in Windows.

## Prerequisites:
1. JAVA JDK - http://www.oracle.com/technetwork/java/javase/downloads/index.html
    * Set environment variable JAVA_HOME under 'System variables': ![set java-home](https://cloud.githubusercontent.com/assets/5630557/11218999/05bae080-8d7e-11e5-8994-cdfb10b21149.PNG)
2. Android SDK - https://developer.android.com/sdk/index.html [Note: Appium supports Android API >=17]
     * Set environment variable ANDROID_HOME under 'System variables': ![set android-home](https://cloud.githubusercontent.com/assets/5630557/11219003/0865b774-8d7e-11e5-8a80-cd623ef7983f.PNG)
3. Node.js - https://nodejs.org/en/download/. Then run following commands to get Appium:
    * npm install -g appium  #get appium
    * npm install wd  #get appium client
    * appium-doctor  #check if everything is correctly set
4. Appium.exe (zip file) (for Appium Inspcetor) - https://bitbucket.org/appium/appium.app/downloads/
5. Apache Maven (zip file) - https://maven.apache.org/download.cgi
     * Set environment variable M2_HOME under 'System variables': ![set maven-home](https://cloud.githubusercontent.com/assets/5630557/11219006/0a353890-8d7e-11e5-8172-201b86314250.PNG)
6. Any IDE: Eclipse - https://www.eclipse.org/downloads/
7. Add all the environment variables set(in steps 1,2 and 5) along with platform-tools and npm(node package manager)path to PATH variable:
So, your PATH variable would look something like:
C:\Windows\System32;%JAVA_HOME%\bin;%ANDROID_HOME%\bin;%M2_HOME%\bin;C:\Users\Administrator\AppData\Local\Android\android-sdk\platform-tools;C:\Program Files\nodejs\node_modules\npm\bin;
![set path variable](https://cloud.githubusercontent.com/assets/5630557/11219010/0dfa59ce-8d7e-11e5-9c01-78f230b25126.PNG)


## Executing a Basic Script 
### Create a Sample Project:
1. Launch Eclipse. Click on File -> New -> Other -> Maven project - https://cloud.githubusercontent.com/assets/5630557/11214563/fdd896f2-8d67-11e5-8197-0e2a65c71855.PNG
2. Select workspace - https://cloud.githubusercontent.com/assets/5630557/11214570/08a4995a-8d68-11e5-8c50-4d61a5b76a73.PNG
3. Select archetype-quickstart - https://cloud.githubusercontent.com/assets/5630557/11214565/01a2a80e-8d68-11e5-8c3f-322086017d83.PNG
4. Provide Group and Artifact ID - https://cloud.githubusercontent.com/assets/5630557/11214567/034e7886-8d68-11e5-9c63-89f69bb58601.PNG
5. Click 'Finish' and you will see your pom.xml as - https://cloud.githubusercontent.com/assets/5630557/11214564/000fa00a-8d68-11e5-95e8-021a1e88c3fa.PNG

### Add Appium Java Client Dependency:
You can add appium java client dependency (which is a java language binding for writing Apiium tests) in pom.xml as - https://cloud.githubusercontent.com/assets/5630557/11215240/350aa6a8-8d6b-11e5-90e8-00114432ce3a.PNG

### Write Script
Desired Capabilities to be taken care of when writing scripts for Android Automation in Appium:
1. DEVICE_NAME: The kind of mobile device or emulator to use (Android Emulator, Nexus 5 etc.)
2. APP_PACKAGE: Java package of the Android app you want to run(say- com.example.android.myApp)
3. APP_ACTIVITY: Activity name for the Android activity you want to launch from your package(MainActivity, .Settings etc.)



