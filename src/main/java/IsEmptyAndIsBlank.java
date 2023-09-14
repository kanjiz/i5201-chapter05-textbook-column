import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文字列なし判定のサンプルコードです。
 * String クラスのメソッド、isEmpty() と isBlank() の使い方を示します。
 * isEmpty() は文字列の長さが 0 かどうかを判定します。
 * isBlank() は文字列の長さが 0 か、空白文字のみで構成されているかを判定します。
 */
public class IsEmptyAndIsBlank {
  public static void main(String[] args) throws IOException {
    // 文字列なし
    System.out.println("===== 文字列なし =====");
    var empty = "";
    System.out.println("empty.isEmpty() = " + empty.isEmpty()); // empty.isEmpty() = true
    System.out.println("empty.isBlank() = " + empty.isBlank()); // empty.isBlank() = true

    // 半角スペース
    System.out.println("===== 半角スペース =====");
    var halfWideSpace = " ";
    System.out.println("halfWideSpace.isEmpty() = " + halfWideSpace.isEmpty()); // halfWideSpace.isEmpty() = false
    System.out.println("halfWideSpace.isBlank() = " + halfWideSpace.isBlank()); // halfWideSpace.isBlank() = true

    // 全角スペース
    System.out.println("===== 全角スペース =====");
    var fullWideSpace = "　";
    System.out.println("fullWideSpace.isEmpty() = " + fullWideSpace.isEmpty()); // fullWideSpace.isEmpty() = false
    System.out.println("fullWideSpace.isBlank() = " + fullWideSpace.isBlank()); // fullWideSpace.isBlank() = true

    // タブ
    System.out.println("===== タブ =====");
    var tab = "\t";
    System.out.println("tab.isEmpty() = " + tab.isEmpty()); // tab.isEmpty() = false
    System.out.println("tab.isBlank() = " + tab.isBlank()); // tab.isBlank() = true

    // 標準入力
    System.out.println("===== 標準入力 =====");
    var br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("文字列を入力してください。");

    while (true) {
      var str = br.readLine();
      if (str.isEmpty()) {
        System.out.println("文字列が入力されていません。");
      } else {
        System.out.println("入力された文字列は「" + str + "」です。");
        break;
      }
    }
  }
}
