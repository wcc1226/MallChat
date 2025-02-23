package com.abin.mallchat.custom.user.domain.vo.response.ws;

import com.abin.mallchat.custom.chat.domain.vo.response.ChatMemberResp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


import java.util.ArrayList;
import java.util.List;

/**
 * Description:用户上下线变动的推送类
 * Author: <a href="https://github.com/zongzibinbin">abin</a>
 * Date: 2023-03-19
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WSOnlineOfflineNotify {
    private List<ChatMemberResp> changeList = new ArrayList<>();//新的上下线用户
    private Long onlineNum;//在线人数
    private Long totalNum;//总人数

}
