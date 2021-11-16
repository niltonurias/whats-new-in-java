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

        String json = """
                {
                    "anime": "Cowboy Bebop",
                    "character": "Spike Spiegel",
                    "quote": "I love the type of woman who can kick my ***."
                }
                """;

        System.out.println(textWithBlock);
        System.out.println();
        System.out.println(query);
        System.out.println();
        System.out.println(json);
    }

    public static void main(String[] args) {
        textBlock();
    }
}
