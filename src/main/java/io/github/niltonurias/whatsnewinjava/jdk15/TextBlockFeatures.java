package io.github.niltonurias.whatsnewinjava.jdk15;

import static io.github.niltonurias.whatsnewinjava.support.TitleUtil.makeTitle;

public class TextBlockFeatures {

    private static void textBlock() {
        makeTitle("text block");
        String textWithBlock = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;

        String query = """
               SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
               WHERE `CITY` = 'INDIANAPOLIS'
               ORDER BY `EMP_ID`, `LAST_NAME`;
               """;

        System.out.println(textWithBlock);
        System.out.println("\n" + query);
    }

    public static void main(String[] args) {
        textBlock();
    }
}
