package com.kgm.board;

import com.kgm.board.controller.UsrArticleController;

import java.util.Scanner;

public class Container {
  public static Scanner sc;
  public static UsrArticleController usrArticleController;
  static{
    sc = new Scanner(System.in);
    usrArticleController = new UsrArticleController();
  }
}
