package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class proyecto extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.proyecto");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.proyecto.class).invoke(this, new Object[] {null});
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
public int _id = 0;
public String _nombre_proyecto = "";
public int _horas_asignadas = 0;
public long _fecha_asignacion = 0L;
public int _empleadosid = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.proyecto __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="proyecto";
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Public Nombre_Proyecto As String";
_nombre_proyecto = "";
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Public Horas_Asignadas As Int";
_horas_asignadas = 0;
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Public Fecha_Asignacion As Long";
_fecha_asignacion = 0L;
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="Public EmpleadosId As Int";
_empleadosid = 0;
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(b4a.example.proyecto __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="proyecto";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="End Sub";
return null;
}
}