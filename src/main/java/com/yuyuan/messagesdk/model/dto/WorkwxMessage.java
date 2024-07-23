package com.yuyuan.messagesdk.model.dto;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONObject;
import com.yuyuan.messagesdk.workwx.message.type.MessageTypeEnum;
import lombok.Data;

/**
 * 消息
 *
 * @author cq
 * @since 2023/12/21
 */
@Data
public class WorkwxMessage implements Message {

    /**
     * 群聊 webhook
     */
    private String webhook;

    /**
     * 内容
     */
    private String content;

}
