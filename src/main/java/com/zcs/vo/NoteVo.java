package com.zcs.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class NoteVo implements Serializable{
    private static final long serialVersionUID = 1L;

    private String groupName; // 分组名称
    private long noteCount; // 云记数量

    private Integer typeId; // 类型ID

}
