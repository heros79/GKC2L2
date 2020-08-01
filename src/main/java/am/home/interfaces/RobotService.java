package am.home.interfaces;

import am.home.model.*;

public interface RobotService {

    public void run(Robot robot);
    public void run(Robot[] robot, RunTrack runTrack);
    public void run(Robot robot, RunTrack[] runTrack);
    public void run(Robot[] robot, RunTrack[] runTrack);

    public void jump(Robot robot, Wall wall);
}