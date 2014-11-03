package com.cn.nio.buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Loctar on 2014/10/30.
 */
public class BufferTest {    public static void main(String[] args) throws IOException {
    RandomAccessFile accessFile=new RandomAccessFile("C:/zhaolo/nio/test.txt","rw");
    FileChannel inChannel = accessFile.getChannel();
    ByteBuffer buf=ByteBuffer.allocate(48);
    int byteRead = inChannel.read(buf);
    buf.flip();

    buf.mark();
    char c1 = (char)buf.get();
    buf.reset();
    char c2 = (char)buf.get();
    System.out.println(c1);
    System.out.println(c2);
    accessFile.close();



}

}
