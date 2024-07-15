package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnempleados = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnproyectos = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _btnempleados_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnempleados_click", false))
	 {return ((String) Debug.delegate(ba, "btnempleados_click", null));}
b4a.example.empleadospage _pageempleados = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub btnEmpleados_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim PageEmpleados As Empleadospage";
_pageempleados = new b4a.example.empleadospage();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="PageEmpleados.Initialize";
_pageempleados._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="B4XPages.AddPageAndCreate(\"PageEmpleados\", PageEm";
_b4xpages._addpageandcreate /*String*/ (ba,"PageEmpleados",(Object)(_pageempleados));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="B4XPages.ShowPage(\"PageEmpleados\")";
_b4xpages._showpage /*String*/ (ba,"PageEmpleados");
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="End Sub";
return "";
}
public String  _btnproyectos_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnproyectos_click", false))
	 {return ((String) Debug.delegate(ba, "btnproyectos_click", null));}
b4a.example.proyectospage _pageproyectos = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub btnProyectos_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim PageProyectos As Proyectospage";
_pageproyectos = new b4a.example.proyectospage();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="PageProyectos.Initialize";
_pageproyectos._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="B4XPages.AddPageAndCreate(\"PageProyectos\", PagePr";
_b4xpages._addpageandcreate /*String*/ (ba,"PageProyectos",(Object)(_pageproyectos));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="B4XPages.ShowPage(\"PageProyectos\")";
_b4xpages._showpage /*String*/ (ba,"PageProyectos");
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private btnEmpleados As Button";
_btnempleados = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private btnProyectos As Button";
_btnproyectos = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
}