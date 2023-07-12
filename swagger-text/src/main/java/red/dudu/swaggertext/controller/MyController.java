package red.dudu.swaggertext.controller;


import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"用户接口"})
@RestController
public class MyController {

    /**
     * @Apioperation用于方法上面，简述方法作用
     * @param name
     * @param id
     * @return
     */
    @ApiOperation(value = "swagger第一个方法", notes = "详细介绍swagger方法的作用！！！")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户姓名", dataType = "string", paramType = "query", required = true, defaultValue = ""),
            @ApiImplicitParam(name = "id", value = "id", dataType = "Integer", paramType = "query", required = true, defaultValue = ""),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "接口访问成功"),
            @ApiResponse(code = 404, message = "接口访问失败")

    })
    @GetMapping("/hello")
    public String swaggerHello(String name, Integer id){
        return "swagger测试！！！！！";
    }
}
