package model;

import java.io.IOException;

/**
 *
 * @author tadaki
 */
public class CLIMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int n = 128;//システムサイズはn*n
        double popRatio = 0.7;//セルに対する個体数の割合
        int nPop = (int) (popRatio * n * n);
        double initIRatio = 0.1;//I(0)
        int initI = (int) (initIRatio * n * n);
        double beta = 0.1;//感染確率
        double gamma = 0.1;//治癒確率
        int tmax = n * n;//最大更新回数
        EpidemicDynamics dynamics
                = new EpidemicDynamics(n, nPop, initI, beta, gamma);
        dynamics.initialize();
        for (int t = 0; t < tmax; t++) {
            if (dynamics.update() == 0) {//感染個体が居なくなると停止
                break;
            }
        }
        //結果をファイルへ
        Save2File.printSequence(dynamics);
    }

}
