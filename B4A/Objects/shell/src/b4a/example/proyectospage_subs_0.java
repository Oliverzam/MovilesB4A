package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class proyectospage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "proyectospage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"proyectos\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("proyectos")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="apiClas.Initialize(\"https://utncloudapi2024071416";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.proyectos.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://utncloudapi20240714160641.azurewebsites.net/api/Proyectos_Asignados")));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("btnactualizar_click")) { __ref.runUserSub(false, "proyectospage","btnactualizar_click", __ref); return;}
ResumableSub_btnActualizar_Click rsub = new ResumableSub_btnActualizar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnActualizar_Click extends BA.ResumableSub {
public ResumableSub_btnActualizar_Click(b4a.example.proyectospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectospage parent;
RemoteObject _fecha = RemoteObject.createImmutable(0L);
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,53);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 54;BA.debugLine="Dim fecha As Long = DateTime.DateParse(txtFecha.T";
Debug.ShouldStop(2097152);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfecha" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 55;BA.debugLine="Wait For (apiClas.Update(txtId.Text,txtNombre.Tex";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectospage", "btnactualizar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.proyectos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, _fecha)),(Object)(BA.numberCast(long.class, __ref.getField(false,"_txthoras" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtidempleado" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 56;BA.debugLine="If r = True Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 57;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 59;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _r) throws Exception{
}
public static void  _btneliminar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("btneliminar_click")) { __ref.runUserSub(false, "proyectospage","btneliminar_click", __ref); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.proyectospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectospage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,63);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 64;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectospage", "btneliminar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.proyectos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 65;BA.debugLine="If r = True Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 66;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 67;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(4);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 68;BA.debugLine="txtNombre.Text= \"\"";
Debug.ShouldStop(8);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 69;BA.debugLine="txtFecha.Text = \"\"";
Debug.ShouldStop(16);
__ref.getField(false,"_txtfecha" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 70;BA.debugLine="txtHoras.Text = \"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_txthoras" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 71;BA.debugLine="txtidEmpleado.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtidempleado" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 73;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btninsertar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("btninsertar_click")) { __ref.runUserSub(false, "proyectospage","btninsertar_click", __ref); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4a.example.proyectospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectospage parent;
RemoteObject _fechamilisegundos = RemoteObject.createImmutable(0L);
RemoteObject _c = RemoteObject.declareNull("b4a.example.proyecto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,40);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 41;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 42;BA.debugLine="Dim fechaMilisegundos As Long";
Debug.ShouldStop(512);
_fechamilisegundos = RemoteObject.createImmutable(0L);Debug.locals.put("fechaMilisegundos", _fechamilisegundos);
 BA.debugLineNum = 43;BA.debugLine="fechaMilisegundos = DateTime.DateParse(txtFecha.T";
Debug.ShouldStop(1024);
_fechamilisegundos = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfecha" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("fechaMilisegundos", _fechamilisegundos);
 BA.debugLineNum = 44;BA.debugLine="Wait For (apiClas.Create(0,txtNombre.Text, fechaM";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectospage", "btninsertar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.proyectos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, _fechamilisegundos)),(Object)(BA.numberCast(long.class, __ref.getField(false,"_txthoras" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtidempleado" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 45;BA.debugLine="If c.Id> 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_c.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 46;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Creado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 49;BA.debugLine="Msgbox(\"No se pudo insertar el registro\",\"OK\")";
Debug.ShouldStop(65536);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnleer_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnLeer_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnleer_click")) { __ref.runUserSub(false, "proyectospage","btnleer_click", __ref); return;}
ResumableSub_btnLeer_Click rsub = new ResumableSub_btnLeer_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnLeer_Click extends BA.ResumableSub {
public ResumableSub_btnLeer_Click(b4a.example.proyectospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.proyectospage parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.proyecto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnLeer_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,26);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 27;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "proyectospage", "btnleer_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.proyectos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 28;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 30;BA.debugLine="txtId.Text = r.Id";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="txtNombre.Text= r.Nombre_Proyecto";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_nombre_proyecto" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="txtHoras.Text = r.Horas_Asignadas";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txthoras" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_horas_asignadas" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtidEmpleado.Text = r.EmpleadosId";
Debug.ShouldStop(1);
__ref.getField(false,"_txtidempleado" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_empleadosid" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Encontrado con éxito")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 36;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(8);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnmenu_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("btnmenu_click")) { return __ref.runUserSub(false, "proyectospage","btnmenu_click", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Private Sub btnMenu_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(8192);
proyectospage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
proyectospage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",proyectospage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
proyectospage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",proyectospage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
proyectospage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",proyectospage._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
proyectospage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",proyectospage._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtHoras As EditText";
proyectospage._txthoras = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txthoras",proyectospage._txthoras);
 //BA.debugLineNum = 7;BA.debugLine="Private txtFecha As EditText";
proyectospage._txtfecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtfecha",proyectospage._txtfecha);
 //BA.debugLineNum = 8;BA.debugLine="Private apiClas As Proyectos";
proyectospage._apiclas = RemoteObject.createNew ("b4a.example.proyectos");__ref.setField("_apiclas",proyectospage._apiclas);
 //BA.debugLineNum = 9;BA.debugLine="Private txtidEmpleado As EditText";
proyectospage._txtidempleado = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtidempleado",proyectospage._txtidempleado);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (proyectospage) ","proyectospage",3,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "proyectospage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Return Me";
Debug.ShouldStop(8192);
if (true) return __ref;
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}