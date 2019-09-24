package com.dada.jedis.protocol;

import java.io.OutputStream;

/**
 * 序列化：需要抓包
 * @author zhoudahua
 * @date 2019/6/26
 * @description
 */
public class Protocol {

    private static final String ASTERISK_BYTE = "*";
    private static final String BLANK = "\r\n";
    private static final String DOLLAR_BYTE = "$";

    public static void sendCommand(OutputStream outputStream, Protocol.Command command, byte[]... args) {
        StringBuffer sb = new StringBuffer();
        sb.append(ASTERISK_BYTE).append(BLANK);
    }

    public static enum Command{
        SET,GET
    }
}
