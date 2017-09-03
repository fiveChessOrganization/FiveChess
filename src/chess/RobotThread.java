package chess;

import util.IChess;

/**
 * 功能: 机器人线程
 * 作者: 蒋宇森  
 * 时间: 2017-08-10
 */
public class RobotThread implements Runnable {
  private IChess chess;
  private ChessTable chessTable;
  public RobotThread(ChessTable chessTable,IChess chess){
    this.chessTable=chessTable;
    this.chess=chess;
  }

  public void run(){
    chessTable.robotChess();
  }

}
