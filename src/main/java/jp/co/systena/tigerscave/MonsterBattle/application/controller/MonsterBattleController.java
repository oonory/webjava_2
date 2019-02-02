package jp.co.systena.tigerscave.MonsterBattle.application.controller;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/monsterbattle")
public class MonsterBattleController {


  // セレクトボックス用
  static Map<String, String> SELECT_ITEMS =
    Collections.unmodifiableMap(new LinkedHashMap<String, String>() {
    {
      put("select_A", "A");
      put("select_B", "B");
      put("select_C", "C");
      put("select_D", "D");
      put("select_E", "E");
    }
  });
}