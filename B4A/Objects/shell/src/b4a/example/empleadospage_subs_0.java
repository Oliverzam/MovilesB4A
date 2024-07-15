package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class empleadospage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "empleadospage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"empleados\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("empleados")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="apiClas.Initialize(\"https://utncloudapi2024071416";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.empleados.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://utncloudapi20240714160641.azurewebsites.net/api/Empleados")));
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
		Debug.PushSubsStack("btnActualizar_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("btnactualizar_click")) { __ref.runUserSub(false, "empleadospage","btnactualizar_click", __ref); return;}
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
public ResumableSub_btnActualizar_Click(b4a.example.empleadospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleadospage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 65;BA.debugLine="Wait For (apiClas.Update(txtId.Text,txtNombre.Tex";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleadospage", "btnactualizar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.empleados.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtcargo" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtsalario" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtdepartameto" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 66;BA.debugLine="If r = True Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("btnEliminar_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("btneliminar_click")) { __ref.runUserSub(false, "empleadospage","btneliminar_click", __ref); return;}
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
public ResumableSub_btnEliminar_Click(b4a.example.empleadospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleadospage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,50);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 51;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleadospage", "btneliminar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.empleados.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 52;BA.debugLine="If r = True Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 53;BA.debugLine="Msgbox(\"Registro Eliminado\", \"OK\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Eliminado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="txtId.Text=\"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 55;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 56;BA.debugLine="txtCargo.Text=\"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtcargo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 57;BA.debugLine="txtSalario.Text=\"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtsalario" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 58;BA.debugLine="txtDepartameto.Text=\"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtdepartameto" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("btnInsertar_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("btninsertar_click")) { __ref.runUserSub(false, "empleadospage","btninsertar_click", __ref); return;}
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
public ResumableSub_btnInsertar_Click(b4a.example.empleadospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleadospage parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.empleado");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,40);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 41;BA.debugLine="Wait For (apiClas.Create(0,txtNombre.Text,txtCarg";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleadospage", "btninsertar_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.empleados.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtcargo" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtsalario" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtdepartameto" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 42;BA.debugLine="If c.Id> 0 Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 43;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Creado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 46;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"OK\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btnLeer_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnleer_click")) { __ref.runUserSub(false, "empleadospage","btnleer_click", __ref); return;}
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
public ResumableSub_btnLeer_Click(b4a.example.empleadospage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.empleadospage parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.empleado");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnLeer_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,26);
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
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "empleadospage", "btnleer_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.empleados.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
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
 BA.debugLineNum = 29;BA.debugLine="txtId.Text=r.Id";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="txtNombre.Text = r.Nombre";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="txtCargo.Text=r.Cargo";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtcargo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_cargo" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="txtSalario.Text=r.Salario";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtsalario" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_salario" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtDepartameto.Text=r.Departamento";
Debug.ShouldStop(1);
__ref.getField(false,"_txtdepartameto" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_departamento" /*RemoteObject*/ )));
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
		Debug.PushSubsStack("btnMenu_Click (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("btnmenu_click")) { return __ref.runUserSub(false, "empleadospage","btnmenu_click", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Private Sub btnMenu_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(4096);
empleadospage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
empleadospage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",empleadospage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
empleadospage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",empleadospage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
empleadospage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",empleadospage._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
empleadospage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",empleadospage._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtCargo As EditText";
empleadospage._txtcargo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtcargo",empleadospage._txtcargo);
 //BA.debugLineNum = 7;BA.debugLine="Private txtSalario As EditText";
empleadospage._txtsalario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtsalario",empleadospage._txtsalario);
 //BA.debugLineNum = 8;BA.debugLine="Private txtDepartameto As EditText";
empleadospage._txtdepartameto = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtdepartameto",empleadospage._txtdepartameto);
 //BA.debugLineNum = 9;BA.debugLine="Private apiClas As Empleados";
empleadospage._apiclas = RemoteObject.createNew ("b4a.example.empleados");__ref.setField("_apiclas",empleadospage._apiclas);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (empleadospage) ","empleadospage",2,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "empleadospage","initialize", __ref, _ba);}
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