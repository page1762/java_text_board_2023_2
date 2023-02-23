package com.kgm.board;

import com.kgm.board.controller.UsrArticleController;
import com.kgm.board.controller.UsrMemberController;

import java.util.Scanner;

public class Container {
  public static Scanner sc;
  public static UsrArticleController usrArticleController;
  public static UsrMemberController usrMemberController;

  static {
    sc = new Scanner(System.in);
    usrArticleController = new UsrArticleController();
    usrMemberController = new UsrMemberController();
  }
}
