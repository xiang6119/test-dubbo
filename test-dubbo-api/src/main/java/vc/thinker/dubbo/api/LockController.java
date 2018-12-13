package vc.thinker.dubbo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import vc.thinker.dubbo.service.LockService;

/**
 * 提供锁相关api
 * @author ZhangGaoXiang
 * @date 2018年11月30日 下午2:29:47
 */
@RestController
@RequestMapping("lock")
@Api(value = "锁相关 - Api", description = "锁相关 - Api")
public class LockController {

	@Reference(check=false)
	private LockService lockService;
	
	@RequestMapping(value = "findOne", method = { RequestMethod.GET})
	@ApiOperation(value="单个锁查询",notes="单个锁查询")
	public String findOne(Long id) {
		return lockService.findOne(id);
	}
	
	
	@RequestMapping(value = "listByType", method = { RequestMethod.GET})
	@ApiOperation(value="锁列表查询",notes="锁列表查询")
	public String listByType(Integer type) {
		return lockService.listByType(type);
	}
	
}
