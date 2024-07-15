package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class proyectospage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.proyectospage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.proyectospage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txthoras = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtfecha = null;
public b4a.example.proyectos _apiclas = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtidempleado = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.proyectospage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="proyectospage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.proyectospage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="proyectospage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Root.LoadLayout(\"proyectos\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("proyectos",ba);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="apiClas.Initialize(\"https://utncloudapi2024071416";
__ref._apiclas /*b4a.example.proyectos*/ ._initialize /*String*/ (null,ba,"https://utncloudapi20240714160641.azurewebsites.net/api/Proyectos_Asignados");
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public void  _btnactualizar_click(b4a.example.proyectospage __ref) throws Exception{
RDebugUtils.currentModule="proyectospage";
if (Debug.shouldDelegate(ba, "btnactualizar_click", false))
	 {Debug.delegate(ba, "btnactualizar_click", null); return;}
ResumableSub_btnActualizar_Click rsub = new ResumableSub_btnActualizar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnActualizar_Click extends BA.ResumableSub {
public ResumableSub_btnActualizar_Click(b4a.example.proyectospage parent,b4a.example.proyectospage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.proyectospage __ref;
b4a.example.proyectospage parent;
long _fecha = 0L;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectospage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim fecha As Long = DateTime.DateParse(txtFecha.T";
_fecha = parent.__c.DateTime.DateParse(__ref._txtfecha /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText());
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Wait For (apiClas.Update(txtId.Text,txtNombre.Tex";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectospage", "btnactualizar_click"), __ref._apiclas /*b4a.example.proyectos*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(int) (_fecha),(long)(Double.parseDouble(__ref._txthoras /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(int)(Double.parseDouble(__ref._txtidempleado /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="If r = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btneliminar_click(b4a.example.proyectospage __ref) throws Exception{
RDebugUtils.currentModule="proyectospage";
if (Debug.shouldDelegate(ba, "btneliminar_click", false))
	 {Debug.delegate(ba, "btneliminar_click", null); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.proyectospage parent,b4a.example.proyectospage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.proyectospage __ref;
b4a.example.proyectospage parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectospage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectospage", "btneliminar_click"), __ref._apiclas /*b4a.example.proyectos*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If r = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="txtNombre.Text= \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="txtFecha.Text = \"\"";
__ref._txtfecha /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="txtHoras.Text = \"\"";
__ref._txthoras /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="txtidEmpleado.Text = \"\"";
__ref._txtidempleado /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btninsertar_click(b4a.example.proyectospage __ref) throws Exception{
RDebugUtils.currentModule="proyectospage";
if (Debug.shouldDelegate(ba, "btninsertar_click", false))
	 {Debug.delegate(ba, "btninsertar_click", null); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4a.example.proyectospage parent,b4a.example.proyectospage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.proyectospage __ref;
b4a.example.proyectospage parent;
long _fechamilisegundos = 0L;
b4a.example.proyecto _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectospage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim fechaMilisegundos As Long";
_fechamilisegundos = 0L;
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="fechaMilisegundos = DateTime.DateParse(txtFecha.T";
_fechamilisegundos = parent.__c.DateTime.DateParse(__ref._txtfecha /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText());
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Wait For (apiClas.Create(0,txtNombre.Text, fechaM";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectospage", "btninsertar_click"), __ref._apiclas /*b4a.example.proyectos*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(int) (_fechamilisegundos),(long)(Double.parseDouble(__ref._txthoras /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(int)(Double.parseDouble(__ref._txtidempleado /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (b4a.example.proyecto) result[1];
;
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="If c.Id> 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_c._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Creado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Msgbox(\"No se pudo insertar el registro\",\"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnleer_click(b4a.example.proyectospage __ref) throws Exception{
RDebugUtils.currentModule="proyectospage";
if (Debug.shouldDelegate(ba, "btnleer_click", false))
	 {Debug.delegate(ba, "btnleer_click", null); return;}
ResumableSub_btnLeer_Click rsub = new ResumableSub_btnLeer_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnLeer_Click extends BA.ResumableSub {
public ResumableSub_btnLeer_Click(b4a.example.proyectospage parent,b4a.example.proyectospage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.proyectospage __ref;
b4a.example.proyectospage parent;
b4a.example.proyecto _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="proyectospage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "proyectospage", "btnleer_click"), __ref._apiclas /*b4a.example.proyectos*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (b4a.example.proyecto) result[1];
;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If r.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="txtId.Text = r.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._id /*int*/ ));
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="txtNombre.Text= r.Nombre_Proyecto";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._nombre_proyecto /*String*/ ));
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="txtHoras.Text = r.Horas_Asignadas";
__ref._txthoras /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._horas_asignadas /*int*/ ));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="txtidEmpleado.Text = r.EmpleadosId";
__ref._txtidempleado /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._empleadosid /*int*/ ));
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Encontrado con éxito"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnmenu_click(b4a.example.proyectospage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="proyectospage";
if (Debug.shouldDelegate(ba, "btnmenu_click", false))
	 {return ((String) Debug.delegate(ba, "btnmenu_click", null));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Private Sub btnMenu_Click";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.proyectospage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="proyectospage";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Private txtHoras As EditText";
_txthoras = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Private txtFecha As EditText";
_txtfecha = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Private apiClas As Proyectos";
_apiclas = new b4a.example.proyectos();
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Private txtidEmpleado As EditText";
_txtidempleado = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="End Sub";
return "";
}
}