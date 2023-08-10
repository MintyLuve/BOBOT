/***   README
    TestMotors is a subsystem on the Skateboard consisting of:
     - CTRE Falcon 500 (Talon FX Controller)
     - REV NEW 1650    (REV SPARK MAX Controller)
     - REV NEO 550     (REV SPARK MAX Controller)


    Note:
        When you write your code, it is imperative to have an understanding of the hardware you are coding for!
        So, when we say that we want to program a motor, in reality we are sending directions to the motor CONTROLLER.
        Understanding this can come in handy when diagnosing issues with complex drivebases with complex wiring, ask me how I know =)

    
    So... What is a subsystem?
        A subsystem is a control layer of robot flow which handles the WHAT of certain robot functions.
        Think of it as an interface, you are describing the capabilities of our hardware to the RoboRIO.
        We use it as a way to compartmentalize the different functions of our robot. 

    In this file I would like to see:
        For starters, I want you to do just the 2 SPARK MAX controllers, ignore the Talon FX. (Bonus points if you figure it out on your own though! =D)
        - Initialize the motor controllers
        - Create a default blanket constructor (Just one to instantiate each motor controller)
        - Create a motor STOP method for each motor controller (for emergencies!)
        - Create a motor SET method for each motor controller

    
    For each motor controller, here is documentation to help you figure out what to use:
        - SPARK MAX (https://codedocs.revrobotics.com/java/com/revrobotics/cansparkmax)
        - Falcon FX (https://api.ctr-electronics.com/phoenix/release/java/com/ctre/phoenix/motorcontrol/IMotorController.html)


    To set up your VS Code instance you will need to install 2 Vendor Libraries, to install:
        - Press CTRL-Shift-P
        - Select WPILib: Manage Vendor Libraries
        - Select Install new libraries (online)
        - Enter https://maven.ctr-electronics.com/release/com/ctre/phoenix/Phoenix5-frc2023-latest.json
        - Repeat Steps 1-3
        - Enter https://software-metadata.revrobotics.com/REVLib-2023.json
    
    Use as many helper methods as you need, but do not modify the method headers I have provided (except for adding your custom parameters).

    As always if you feel I've missed something or need help, please feel free to reach out to me on slack or in person! (Depending where I am at the time! =D)

***/
package frc.robot.subsystems;

public class TestMotors {
        // Blanket Constructor
    public TestMotors(){
    
    }
    
        // Passing a desired value to the SMALL NEO
    public void setMotorSmallNeo(){
    
    }

        // Passing a desired value to the BIG NEO
    public void setMotorBigNeo(){

    }

        // Making the BIG NEO stop
    public void stopMotorBigNeo(){

    }

        // Making the SMALL NEO stop
    public void stopMotorSmallNeo(){

    }
}
