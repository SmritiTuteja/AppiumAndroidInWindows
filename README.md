# Mobile Automation using Appium in Windows
This repo contains details of how to kick start Mobile Automation using Appium in Windows.

#Prerequisites (Installation and Setup)
1. JAVA JDK - http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. Set environment variable JAVA_HOME under 'System variables': https://cloud.githubusercontent.com/assets/5630557/11212911/efddc616-8d5e-11e5-8f25-5c006be3a723.PNG
3. Android SDK - https://developer.android.com/sdk/index.html
3. Set environment variable ANDROID_HOME under 'System variables'(can get path when you launch android sdk(refer screenshot in step 4 below): https://cloud.githubusercontent.com/assets/5630557/11213168/96734342-8d60-11e5-8dca-689693e8455f.PNG
4. Update Android SDK Manager: https://cloud.githubusercontent.com/assets/5630557/11213044/dbcd015e-8d5f-11e5-9443-617febf57120.PNG
Note: Appium supports Android API >=17
5. Node.js - https://nodejs.org/en/download/
6. Appium.exe - https://bitbucket.org/appium/appium.app/downloads/
7. Apache Maven - https://maven.apache.org/download.cgi
8. Set environment variable M2_HOME under 'System variables': https://cloud.githubusercontent.com/assets/5630557/11213607/d8dc6a4a-8d62-11e5-8909-965e61b65898.PNG
9. Add all the environment variables set(in steps 2, 3 and 8) along with platform-tools path to PATH variable: https://cloud.githubusercontent.com/assets/5630557/11213748/b5e03b6a-8d63-11e5-8930-e51c7a70f59f.PNG
So, your PATH variable would look something like:
C:\Windows\System32;%JAVA_HOME%\bin;%ANDROID_HOME%\bin;%M2_HOME%\bin;C:\Users\Administrator\AppData\Local\Android\android-sdk\platform-tools;


