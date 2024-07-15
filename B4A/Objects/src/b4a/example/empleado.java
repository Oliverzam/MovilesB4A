package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class empleado extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.empleado");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.empleado.class).invoke(this, new Object[] {null});
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
public String _nombre = "";
public String _cargo = "";
public double _salario = 0;
public String _departamento = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.empleado __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="empleado";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.empleado __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleado";
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="Public Nombre As String";
_nombre = "";
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Public Cargo As String";
_cargo = "";
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="Public Salario As Double";
_salario = 0;
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="Public Departamento As String";
_departamento = "";
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="End Sub";
return "";
}
}