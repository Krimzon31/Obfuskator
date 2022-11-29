package com.company;

public class MetaSimvl {
    String tx;
    public String MetaSimvl(String tx){
        this.tx = tx;

        tx = tx.replaceAll("\s*\\{\s*", "{"); // удаление пробелов до и после {
        tx = tx.replaceAll("\s*}\s*", "}"); // удаление пробелов до и после }

        tx = tx.replaceAll("\s*\\(\s*", "("); // удаление пробелов до и после (
        tx = tx.replaceAll("\s*\\)\s*", ")"); // удаление пробелов до и после )

        tx = tx.replaceAll("\s*\\[\s*", "["); // удаление пробелов до и после [
        tx = tx.replaceAll("\s*]\s*", "]"); // удаление пробелов до и после ]

        tx = tx.replaceAll("\s*,\s*", ","); // удаление пробелов после ,

        tx = tx.replaceAll("\s*=\s*", "="); // удаление пробелов до и после =

        tx = tx.replaceAll("\s*/\s*", "/"); // удаление пробелов до и после /

        tx = tx.replaceAll("\s*\\*\s*", "*"); // удаление пробелов до и после *

        tx = tx.replaceAll("\s*\\+ ", "+"); // удаление пробелов до и после +

        tx = tx.replaceAll("\s*-\s*", "-"); // удаление пробелов до и после -

        tx = tx.replaceAll("\s*%\s*", "%"); // удаление пробелов до и после %

        tx = tx.replaceAll("\s*;\s*", ";"); // удаление пробелов до и после ;

        tx = tx.replaceAll("\s*:\s*", ":"); // удаление пробелов до и после :

        tx = tx.replaceAll("\s*>\s*", ">"); // удаление пробелов до и после >

        tx = tx.replaceAll("\s*<\s*", "<"); // удаление пробелов до и после <

        tx = tx.replaceAll("\s*>=\s*", ">="); // удаление пробелов до и после >=

        tx = tx.replaceAll("\s*<=\s*", "<="); // удаление пробелов до и после <=

        return tx;
    }

}
