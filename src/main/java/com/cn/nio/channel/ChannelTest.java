package com.cn.nio.channel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Loctar on 2014/10/30.
 */
public class ChannelTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile=new RandomAccessFile("C:/zhaolo/nio/test.txt","rw");
        FileChannel inChannel = accessFile.getChannel();
        ByteBuffer buf=ByteBuffer.allocate(48);
        int byteRead = inChannel.read(buf);
        while (byteRead!=-1){
            System.out.println("read:" +byteRead);
            buf.flip();
            while (buf.hasRemaining()){
                System.out.println((char)buf.get());
            }
            buf.clear();
            byteRead=inChannel.read(buf);
        }
        accessFile.close();


    }
}
