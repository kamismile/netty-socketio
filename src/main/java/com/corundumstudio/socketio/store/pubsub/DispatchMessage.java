/**
 * Copyright 2012 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.corundumstudio.socketio.store.pubsub;

import com.corundumstudio.socketio.parser.Packet;

public class DispatchMessage extends PubSubMessage {

    private String room;
    private Packet packet;

    public DispatchMessage() {
    }

    public DispatchMessage(String room, Packet packet) {
        this.room = room;
        this.packet = packet;
    }

    public Packet getPacket() {
        return packet;
    }

    public String getRoom() {
        return room;
    }

}
