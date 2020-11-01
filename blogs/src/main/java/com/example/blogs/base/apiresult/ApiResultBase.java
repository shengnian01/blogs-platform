package com.example.blogs.base.apiresult;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by chenyuanguo on 2017/3/28.
 */

@ApiModel(value = "Api返回结果对象基类")
public class ApiResultBase
{
	public static final ApiResultBase SUCCESS = new ApiResultBase(0, "成功");
	public static final ApiResultBase FAIL = new ApiResultBase(1, "失败");
	public static final ApiResultBase PARAMS_ERROR = new ApiResultBase(2, "参数错误");
	public static final ApiResultBase AUTHFAILD = new ApiResultBase(401, "认证失败");
	public static final ApiResultBase PERMISSION_DENIED = new ApiResultBase(403, "权限不足");

	@ApiModelProperty("Api返回状态")
	@JsonProperty("status")
	private int status;

	@ApiModelProperty("Api返回状态消息")
	@JsonProperty("msg")
	private String msg;

	public ApiResultBase()
	{
	}

	public ApiResultBase(int status, String msg)
    {
	    super();
	    this.status = status;
	    this.msg = msg;
    }

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}
