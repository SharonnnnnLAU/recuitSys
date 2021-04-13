package com.happy.gym.controller;

import com.happy.gym.manager.result.R;
import com.happy.gym.manager.result.Status;
import com.happy.gym.model.vo.ToolAddVo;
import com.happy.gym.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    private ToolService toolService;

    @RequestMapping("/listTool")
    public R listTool(Integer page, Integer limit) {return toolService.listTool(page, limit);}

    @RequestMapping("/modToolStatus")
    public R modToolStatus(Integer id) {
        if (id == null) {
            return R.Warn(Status.ARGS_NOT_ALLOW_NULL);
        }
        return toolService.modToolStatus(id);
    }

    @RequestMapping(value = "/toolDetail", method = RequestMethod.GET)
    public R toolDetail(Integer id) {
        if (id == null) {
            return R.Warn(Status.ARGS_NOT_ALLOW_NULL);
        }
        return toolService.findToolDetail(id);
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public R delTool(Integer id) {
        if (id == null) {
            return R.Warn(Status.ARGS_NOT_ALLOW_NULL);
        }
        return toolService.delTool(id);
    }

    @RequestMapping(value = "/addTool", method = RequestMethod.POST)
    public R addTool(@Validated ToolAddVo toolAddVo, BindingResult errors) {
        if (errors.hasErrors()) {
            String msg = errors.getAllErrors().get(0).getDefaultMessage();
            return R.Error(998, msg);
        }
        return toolService.addTool(toolAddVo);
    }

}
