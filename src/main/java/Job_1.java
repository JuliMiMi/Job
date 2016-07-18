import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.reader.StreamReader;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by Julia on 18.07.2016.
 */
public class Job_1 {

    public static void main(String[] args) {
/*
       int[] main_ar = new int[11];
                main_ar[0] = 1;
                main_ar[1] = 2;
                main_ar[2] = 6;
                main_ar[3] = 5;
                main_ar[4] = 4;
                main_ar[5] = 6;
                main_ar[6] = 4;
                main_ar[7] = 0;
                main_ar[8] = 2;
                main_ar[9] = 1;
                main_ar[10] = 5;*/

        int K = 0;


       Yaml yaml = new Yaml();
       int[] main_ar = (int[])yaml.load(new File("file.yml"));

        for(int i=0; i<11; i++)
        {
            int S = main_ar[i];
            for(int j=0; j<11; j++)
            {
                if(S!=main_ar[j])
                {
                    K=S;
                }
                S=0;
            }
        }
        System.out.print("Искомое число = ");
        System.out.print(K);

    }

}
