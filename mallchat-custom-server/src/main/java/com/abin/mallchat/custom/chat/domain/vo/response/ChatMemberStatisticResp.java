package com.abin.mallchat.custom.chat.domain.vo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Description: 群成员统计信息
 * Author: <a href="https://github.com/zongzibinbin">abin</a>
 * Date: 2023-03-23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMemberStatisticResp {

    @ApiModelProperty("在线人数")
    private Long onlineNum;//在线人数
    @ApiModelProperty("总人数")
    private Long totalNum;//总人数
}
