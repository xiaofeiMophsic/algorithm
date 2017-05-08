package com.mophsic.sort.data;

import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.value.Value;

import javax.xml.transform.Templates;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaofei
 * @date 2017/5/8
 */
public class MessagePackTest {
    public static void main(String[] args) throws Exception{
        MessageBufferPacker packer = MessagePack.newDefaultBufferPacker();
        packer.packArrayHeader(2);
        packer.packString("packer");
        packer.packString("test");
        packer.close();

        MessageUnpacker unpacker = MessagePack.newDefaultUnpacker(packer.toByteArray());
        int len ;
        String[] message = new String[len = unpacker.unpackArrayHeader()];
        for (int i = 0; i < len; i++) {
            message[i] = unpacker.unpackString();
        }

        System.out.println(message[0] + message[1]);

    }
}
