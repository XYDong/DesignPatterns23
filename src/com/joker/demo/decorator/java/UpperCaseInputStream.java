package com.joker.demo.decorator.java;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @version 1.0.0
 * @ClassName UpperCaseInputStream.java
 * @Package com.joker.demo.decorator.java
 * @Author Joker
 * @Description
 * @CreateTime 2021年07月20日 10:11:00
 */
public class UpperCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }
    @Override
    public int read() throws IOException{
        int read = super.read();
        return read == -1? read : Character.toUpperCase((char) read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        for (int i = 0; i < read; i++) {
            b[i] = (byte) Character.toUpperCase(b[i]);
        }
        return read;
    }
}
