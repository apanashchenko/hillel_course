package lec_13.Factories;

import lec_13.Configuration;
import lec_13.Enums.Envs;

public class EnvFactory {
    public String getEnv(){
        String env = null;
        Envs envFromConfig = Envs.valueOf(Configuration.getInstance().getEnv().toUpperCase());


        switch(envFromConfig){
            case TEST:
                env = "test";
                break;
            case DEV:
                env = "dev";
                break;
            case CLOUD:
                env = "cloud";
                break;
                default:
                    System.out.println(env + "doesn't supported");
        }
        return env;
    }
}
