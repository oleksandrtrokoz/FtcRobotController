package org.firstinspires.ftc.teamcode;

//import these, they usually get imported automatically as you call on them
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/*
disables this class(Test.java),
this keeps the code in the teamcode folder, but it will not be written onto the bot
 */

@Disabled

//for manual control, absolutely mandatory, for automatic control use @Autonomous
@TeleOp

//extends OpMode
public class Test extends OpMode {

    //for every class an init method and a loop method is needed

    /*
    overriding the OpMode initialize method with a new custom initialize method
    public: other classes can see this method
    void: nothing will be done with this method
     */
    @Override
    public void init() {

        //telemetry is an object, using dot notation (.), methods associated with that object can be called
        telemetry.addData("Hello", "World"); // do not forget semicolons, unless using curly brackets ({)
    }

    //overriding the OpMode loop method with a new loop method
    @Override
    public void loop() {
        //loop can be empty
    }
}
