package lec_14.Factories;

import lec_14.Configuration;
import lec_14.Enums.Envs;

public class EnvFactory {
    public String getEnv() throws Exception {
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
                    throw new Exception("Envirement doesn't supported");
        }
        return env;
    }
}
