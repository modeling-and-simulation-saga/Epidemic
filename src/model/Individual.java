package model;

import java.util.List;

/**
 * 個体のクラス
 *
 * @author tadaki
 */
public class Individual {

    //個体の状態
    static public enum State { S(0), I(1), R(2); 
        public int k;
        State(int k){this.k=k;}
    }
    private State state;//現在の状態
    private State nextState;//次の状態

    /**
     * 状態を指定して初期化
     * 
     * @param state
     */
    public Individual(State state) {  this.state = state; }

    /**
     * 現在のセルの状態から次の時刻のセルの状態を計算
     *
     * @param neighbours 隣接個体のリスト
     * @param beta 感染確率
     * @param gamma 治癒確率
     * @param r Math.random()に相当する乱数
     * @return
     */
    public State evalNextState(List<Individual> neighbours,
            double beta, double gamma, double r) {
        nextState = state;
        switch (state) {//注目している個体の状態毎に判断
            case S://状態がSである場合
                boolean f = false;
                //周囲のセルに状態Iの個体が居るか
                for (Individual neighbour : neighbours) {


                }
                //fがtrueの時、確率betaで病気に罹る
                
                break;
            case I://状態がIである場合
                if (r < gamma) { nextState = State.R; }//病気が治る
                break;
            default:
                break;
        }
        return nextState;
    }

    /**
     * 本当に状態を更新する
     * 
     */
    public void update() { state = nextState; }

    public State getState() { return state; }

}
