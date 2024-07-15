package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnempleados_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEmpleados_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("btnempleados_click")) { return __ref.runUserSub(false, "b4xmainpage","btnempleados_click", __ref);}
RemoteObject _pageempleados = RemoteObject.declareNull("b4a.example.empleadospage");
 BA.debugLineNum = 28;BA.debugLine="Private Sub btnEmpleados_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Dim PageEmpleados As Empleadospage";
Debug.ShouldStop(268435456);
_pageempleados = RemoteObject.createNew ("b4a.example.empleadospage");Debug.locals.put("PageEmpleados", _pageempleados);
 BA.debugLineNum = 30;BA.debugLine="PageEmpleados.Initialize";
Debug.ShouldStop(536870912);
_pageempleados.runClassMethod (b4a.example.empleadospage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="B4XPages.AddPageAndCreate(\"PageEmpleados\", PageEm";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageEmpleados")),(Object)((_pageempleados)));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.ShowPage(\"PageEmpleados\")";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageEmpleados")));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnproyectos_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnProyectos_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("btnproyectos_click")) { return __ref.runUserSub(false, "b4xmainpage","btnproyectos_click", __ref);}
RemoteObject _pageproyectos = RemoteObject.declareNull("b4a.example.proyectospage");
 BA.debugLineNum = 36;BA.debugLine="Private Sub btnProyectos_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Dim PageProyectos As Proyectospage";
Debug.ShouldStop(16);
_pageproyectos = RemoteObject.createNew ("b4a.example.proyectospage");Debug.locals.put("PageProyectos", _pageproyectos);
 BA.debugLineNum = 38;BA.debugLine="PageProyectos.Initialize";
Debug.ShouldStop(32);
_pageproyectos.runClassMethod (b4a.example.proyectospage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 40;BA.debugLine="B4XPages.AddPageAndCreate(\"PageProyectos\", PagePr";
Debug.ShouldStop(128);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageProyectos")),(Object)((_pageproyectos)));
 BA.debugLineNum = 41;BA.debugLine="B4XPages.ShowPage(\"PageProyectos\")";
Debug.ShouldStop(256);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageProyectos")));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private btnEmpleados As Button";
b4xmainpage._btnempleados = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnempleados",b4xmainpage._btnempleados);
 //BA.debugLineNum = 12;BA.debugLine="Private btnProyectos As Button";
b4xmainpage._btnproyectos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnproyectos",b4xmainpage._btnproyectos);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}