## Verifying the Installation

Run ``appium-doctor`` to check for complete installation.

For Android ``appium-doctor --android``

For iOS    ``appium-doctor --ios``

## Environment variables

#### on macOS/on Linux distributions

- Set **JAVA_HOME**  
```echo export "JAVA_HOME=\$(/usr/libexec/java_home)" >> ~/.bash_profile```

- Set **ANDROID_HOME**  
```export ANDROID_HOME=/Users/<Your UserName>/Library/Android/sdk```  

  Update the Path with your **UserName**

- Set **PATH** variables  
```export PATH=${PATH}:$ANDROID_HOME/tools:$ANDROID_HOME/build-tools/<Android Version>:$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools/bin:$ANDROID_HOME/emulator:$JAVA_HOME/bin```

  Update the Path with your **Android Version**


#### on Windows

- Set **JAVA_HOME**
 
  - Search for **Advanced settings**   
  - Click the **Advanced tab**, then click the **Environment Variables** button.  
  - Under **System Variables**, click New.  
  - Enter the variable name as **JAVA_HOME**.  
  - Enter the variable value as the **installation path** for the Java Development Kit.  
  - Click **OK**.  
  - Click **Apply Changes**. 

  ![alt text](https://i.imgur.com/P6NQyrz.jpg)
  

  
- Set **ANDROID_HOME**  

  ![alt text](https://i.imgur.com/S8Qiu5i.png)
  

## Connect device In USB debugging mode
 You need to connect real android device with PC in USB debugging mode in order to run android app automation tests in real android device using appium.
   ### Enable Developer Option
   To enable **Developer Option** in android device
  - Go to **Settings**.
  - Scroll down to bottom and tap on **About Phone**.
  - Scroll down bottom again on About Phone screen. You will see option **Build number**.
  - Tap on **Build number** option one by one until tt will show you message **"You are now a developer!"**. 
  - Now go back to **Settings** and scroll **down bottom**.

You will see option **Developer Options** above About Phone.
  
 ### To start USB Debugging mode
 Connect your device with PC using USB cable.  
  - Go to **Settings -> Developer options**.
  - There will be option **USB debugging** with check box. **Check it**.  
  - It will ask you to **"Allow USB debugging?"**. Tap on **OK**.  
 
 It will **enable USB debugging mode** for your android device.
  
  ### Verify Device Connected Properly With PC
  To verify device is connected properly with PC with USB debugging mode,
   - Open **command prompt** in your PC.
   - Run command **adb devices**.
   
  It will show you list of connected devices with your PC.
  
## Last steps before running test

### Locating elements using UIAutomatorViewer
What Is UI Automator Viewer?
UI Automator Viewer is a tool provided by android SDK. UI Automator Viewer will provide you an user interface to scan and analyse UI components of android software application. Using UI Automator Viewer, We can inspect the android app component hierarchy, Inspect properties of android app components and then we can use those element's properties to create xpath of element and use them in automation test scripts.

### Inspecting App's UI Element Using UI Automator Viewer
We will use default and simple calculator app of android phone to learn how to inspect its's UI elements using UI Automator Viewer tool. Follow the steps given bellow.

- Connect your android device with PC (USB debugging mode should be enabled) as described in [here](https://github.com/thenishant/Getting_started_with_Mobile_Automation/blob/master/chapter%202/README.md#TostartUSBDebuggingmode).
- Run command **"adb devices"** in command prompt to verify device is connected properly with PC.
- Run **uiautomatorviewer.bat** file from **E:\SDK\tools** folder. Click [here](https://github.com/thenishant/Getting_started_with_Mobile_Automation/blob/master/chapter%202/README) to know more about SDK folder. 

 - It will open **UI Automator Viewer** tool's UI as bellow.
 
    ![](https://i.imgur.com/OV63zpQ.png)

 - Open **Calculator application** in your android phone.
 - In UI **Automator Viewer**, Click on **Device Screenshot image button** as shown in below image.
 
 ![](https://i.imgur.com/nQAM4Pg.png)
    
 - After capturing screenshot of android phone screen, It will **show your android phone's calculator's UI** in UI Automator Viewer as below. 
 - On **left side** it will show you **calculator app's screenshot** which is open in android device.
 - **Right side top** part will show **calculator app's UI element's hierarchy view**. It will display node structure to explain **how elements are arranged**.
 - **Right side bottom** part will show property **detail of selected element**.
 
    ![](https://i.imgur.com/DgbuNpO.png)

    
 - In calculator screenshot (which is display in UI Automator Viewer), Select **button 5** to view it's different properties as shown in bellow image.
 
    ![](https://i.imgur.com/8CtODLI.png)
     
 - It is showing different properties of **button 5** in right side node detail section which we can use to locate it using different element locating strategy. 

 ## Appium Desktop

Appium Desktop is a new graphical interface for starting an Appium server and inspecting your app's structure via Appium. Appium Desktop is available across all Operating Systems.
 
 ![](https://i.imgur.com/TOKTtk6.png)
 
**Start Appium Server**

![](https://i.imgur.com/uPiVmFD.png)

**Appium Inspector**

![](https://i.imgur.com/eaRE8R8.png)

Please check the next section for Desired Capabilities

## Desired Capabilities
Desired Capabilities are set of values which tells Appium Server what kind of Automation Server should be started. Desired Capabilities tells Appium drivers all kinds of important things about how you want your test to work. 

Check out Desired Capabilities [Documentation](http://appium.io/docs/en/writing-running-appium/caps/index.html)

![](https://i.imgur.com/SYkvaOm.png)

 
## Troubleshooting guide

#### How to get app package and launch activity ?
Use below commands to get
    
   Package name:  
    ```aapt dump badging /path/to/apk | grep package:\ name```
    
   Launchable Activity  
    ```aapt dump badging /path/to/apk  | grep launchable-activity:\ name```
    
## Self-Assessment    
    
- Automate Buying a product (Flipkart or amazon).
    - Open app,
    - Search for a mobile, store the name and price of that mobile somewhere,
    - Add it to cart,
    - Navigate to cart,
    - Verify for the name and price of the watch, and make the test pass if everything matches else fail the test.
    
- Automate Buying the cheapest product (Flipkart or amazon).
    - This is an enhancement for above assessment,
    - Instead for selecting the first mobile, select cheapest one from the list,
    - Verify for the name and price of the watch, and make the test pass if everything matches else fail the test.

- Automate a return trip booking (MakeMyTrip, ClearTrip, or any app of your choice).
    - Open app,
    - Navigate to flight booking screen,
    - Search for a flight from one place to another,
    - Select traveller count as 3,
    - Select travel date as next monday to friday,
    - Save all the details in a class or enum,
    - Navigate to checkout/Booking confirmation page,
    - Check whether or not all the travel details are correct.