この src/main/java ディレクトリには、Java のソースコードを配置します。


「文字列なし」を確認するなら、`String.isEmpty()` が使えます。

[String.isEmpty\(\) \(Java SE 20 & JDK 20\)](https://docs.oracle.com/javase/jp/20/docs/api/java.base/java/lang/String.html#isEmpty())

また、Java 11 からは、`String.isBlank()` が導入されました。

[String.isBlank\(\) \(Java SE 20 & JDK 20\)](https://docs.oracle.com/javase/jp/20/docs/api/java.base/java/lang/String.html#isBlank())

IsEmptyAndIsBlank.java では、`String.isEmpty()` と `String.isBlank()` の違いを確認できます。
`String.equals()` でも `String.isEmpty()` でも、`null` の場合には `NullPointerException` が発生します。

Ctrl + Z を押した後に、Enter を押すと、`NullPointerException` が発生します。

`String` クラスのメソッドを呼び出すときは、`null` チェックを忘れないようにしましょう。




