package lec_16.Factories;

import lec_16.Configuration;
import lec_16.Enums.Envs;

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
