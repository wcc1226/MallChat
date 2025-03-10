package com.abin.mallchat.custom.chat.service;

import com.abin.mallchat.common.chat.dao.MessageDao;
import com.abin.mallchat.common.chat.domain.entity.Message;
import com.abin.mallchat.common.common.domain.vo.request.CursorPageBaseReq;
import com.abin.mallchat.common.common.domain.vo.response.CursorPageBaseResp;
import com.abin.mallchat.custom.chat.domain.vo.request.ChatMessageMarkReq;
import com.abin.mallchat.custom.chat.domain.vo.request.ChatMessagePageReq;
import com.abin.mallchat.custom.chat.domain.vo.request.ChatMessageReq;
import com.abin.mallchat.custom.chat.domain.vo.response.ChatMemberResp;
import com.abin.mallchat.custom.chat.domain.vo.response.ChatMemberStatisticResp;
import com.abin.mallchat.custom.chat.domain.vo.response.ChatMessageResp;
import com.abin.mallchat.custom.chat.domain.vo.response.ChatRoomResp;
import com.abin.mallchat.custom.chat.service.adapter.MessageAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;

/**
 * Description: 消息处理类
 * Author: <a href="https://github.com/zongzibinbin">abin</a>
 * Date: 2023-03-26
 */
public interface ChatService {

    /**
     * 发送消息
     *
     * @param request
     */
    Long sendMsg(ChatMessageReq request, Long uid);

    /**
     * 根据消息获取消息前端展示的物料
     * @param message
     * @param receiveUid 接受消息的uid，可null
     * @return
     */
    ChatMessageResp getMsgResp(Message message,Long receiveUid);
    /**
     * 根据消息获取消息前端展示的物料
     * @param msgId
     * @param receiveUid 接受消息的uid，可null
     * @return
     */
    ChatMessageResp getMsgResp(Long msgId,Long receiveUid);

    /**
     * 获取群成员列表
     * @param request
     * @return
     */
    CursorPageBaseResp<ChatMemberResp> getMemberPage(CursorPageBaseReq request);

    /**
     * 获取消息列表
     * @param request
     * @return
     */
    CursorPageBaseResp<ChatMessageResp> getMsgPage(ChatMessagePageReq request,@Nullable Long receiveUid);

    /**
     * 获取会话列表
     * @param request
     * @param uid
     * @return
     */
    CursorPageBaseResp<ChatRoomResp> getRoomPage(CursorPageBaseReq request, Long uid);

    ChatMemberStatisticResp getMemberStatistic();

    void setMsgMark(Long uid, ChatMessageMarkReq request);
}
