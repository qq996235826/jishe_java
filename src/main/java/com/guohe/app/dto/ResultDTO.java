package com.guohe.app.dto;


import com.guohe.app.exception.CustomizeErrorCode;
import com.guohe.app.exception.CustomizeException;
import lombok.Data;

/**
 * @description 负责给前端返回操作结果, 成功或者失败等等以及数据Data
 */
@Data
public class ResultDTO {
    private Integer code;   //状态代码
    private String msg; //操作结果的详细信息
    private Object info;         //返回给前端的数据,是个泛型

    /**
     * 描述:本方法类似构造方法,把错误代码和信息传入,返回一个本对象
     *
     * @param code
     * @param message
     * @return ResultDTO
     */
    public static ResultDTO errorOf(Integer code, String message) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMsg(message);
        return resultDTO;
    }

    /**
     * @description/描述: 把错误对象转化成ResultDTO返回给前端, 告诉用户错在哪
     * @param/参数: [errorCode]
     * @return/返回: com.guohe.app.dto.ResultDTO
     **/
    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(), errorCode.getMessage());
    }

    /**
     * @description/描述: 把CustomizeException类型的错误信息打包成ResultDTO返回
     * @param/参数: [CustomizeException]
     * @return/返回: com.guohe.app.dto.ResultDTO
     **/
    public static ResultDTO errorOf(CustomizeException e) {
        return errorOf(e.getCode(), e.getMessage());
    }

    /**
     * @description/描述: 本方法负责返回成功信息
     * @param/参数: 无
     * @return/返回: com.guohe.app.dto.ResultDTO
     **/
    public static ResultDTO okOf() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMsg("请求成功");
        return resultDTO;
    }

    /**
     * @description/描述:本方法返回成功的信息,还带一个传给前端的泛型数据,具体是啥看你怎么调用的
     * @param/参数: 泛型
     * @return/返回: com.guohe.app.dto.ResultDTO
     **/
    public static ResultDTO okOf(Object t) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMsg("请求成功");
        resultDTO.setInfo(t);
        return resultDTO;
    }


}
