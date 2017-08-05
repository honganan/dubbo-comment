/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.remoting;

import javax.sound.midi.Receiver;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * Transporter. (SPI, Singleton, ThreadSafe)
 * 
 * <a href="http://en.wikipedia.org/wiki/Transport_Layer">Transport Layer</a>
 * <a href="http://en.wikipedia.org/wiki/Client%E2%80%93server_model">Client/Server</a>
 * 
 * @see Transporters
 * @author ding.lid
 * @author william.liangf
 */
@SPI("netty")
public interface Transporter {

    /**
     * Bind a server.
     * 
     * @see Transporters#bind(com.alibaba.dubbo.common.URL, javax.sound.midi.Receiver, com.alibaba.dubbo.remoting.ChannelHandler)
     * @param url server url
     * @param handler
     * @return server
     * @throws com.alibaba.dubbo.remoting.RemotingException
     */
    @Adaptive({Constants.SERVER_KEY, Constants.TRANSPORTER_KEY})
    Server bind(URL url, ChannelHandler handler) throws RemotingException;

    /**
     * Connect to a server.
     * 
     * @see Transporters#connect(com.alibaba.dubbo.common.URL, javax.sound.midi.Receiver, ChannelListener)
     * @param url server url
     * @param handler
     * @return client
     * @throws com.alibaba.dubbo.remoting.RemotingException
     */
    @Adaptive({Constants.CLIENT_KEY, Constants.TRANSPORTER_KEY})
    Client connect(URL url, ChannelHandler handler) throws RemotingException;

}