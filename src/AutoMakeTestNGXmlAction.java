import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import util.AutoCreatXML_VirtualFIle;

/**
 * @author: isisiwish
 * @date: 2019/7/11
 * @time: 10:23
 */
public class AutoMakeTestNGXmlAction extends AnAction
{
    @Override
    public void actionPerformed(AnActionEvent e)
    {
        getfilessss(e);
    }
    
    private void getfilessss(AnActionEvent e)
    {
        Project mProject = e.getData(PlatformDataKeys.PROJECT);
        System.out.println("mProject.getBasePath(); = " + mProject.getBasePath());
        DataContext dataContext = e.getDataContext();
        
        VirtualFile[] files = DataKeys.VIRTUAL_FILE_ARRAY.getData(dataContext);
        String re = AutoCreatXML_VirtualFIle.getInstance().readVirtualFile(files, mProject.getBasePath());
        
        Messages.showMessageDialog(mProject, "Hi, process result : \n" + re + "\n\n Check Please .", "结果", Messages.getInformationIcon());
    }
}
