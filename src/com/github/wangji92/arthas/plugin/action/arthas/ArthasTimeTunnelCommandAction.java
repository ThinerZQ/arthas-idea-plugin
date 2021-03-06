package com.github.wangji92.arthas.plugin.action.arthas;

import com.github.wangji92.arthas.plugin.constants.ArthasCommandConstants;
import com.github.wangji92.arthas.plugin.ui.ArthasTimeTunnelDialog;
import com.intellij.openapi.project.Project;

/**
 * 方法执行数据的时空隧道，记录下指定方法每次调用的入参和返回信息，并能对这些不同的时间下调用进行观测
 *
 * @author 汪小哥
 * @date 11-01-2020
 */
public class ArthasTimeTunnelCommandAction extends BaseArthasPluginAction {

    @Override
    public void doCommand(String className, String methodName, Project project) {
        String command = String.join(" ", "tt -t", className, methodName, "-n", ArthasCommandConstants.INVOKE_COUNT);
        new ArthasTimeTunnelDialog(project, command).open("arthas time tunnel use");
    }
}
