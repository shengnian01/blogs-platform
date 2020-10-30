package com.example.blogs.base.apiresult;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by chenyuanguo on 2017/3/28.
 */
@ApiModel(value = "Api返回结果对象", parent = ApiResultBase.class)
@JsonPropertyOrder(value = {"status", "msg", "data"})
public class ApiResult<T> extends ApiResultBase
{
	@ApiModelProperty("Api返回数据")
	private T data;
	public ApiResult(){}
	public ApiResult(ApiResultBase result)
	{
		this(result.getStatus(), result.getMsg(), null);
	}

	public ApiResult(ApiResultBase result, T data)
    {
		this(result.getStatus(), result.getMsg(), data);
    }

	public ApiResult(ApiResultBase result, String msg)
	{
		this(result.getStatus(), msg);
	}

	public ApiResult(int status, String msg)
	{
		this(status, msg, null);
	}

	public ApiResult(int status, String msg, T data)
    {
	    super(status, msg);
	    this.data = data;
    }

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}

}
