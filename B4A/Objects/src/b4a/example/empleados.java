package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class empleados extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.empleados");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.empleados.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.empleados __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub Initialize  (url As String)";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.empleados __ref,int _id,String _nombre,String _cargo,double _salario,String _departamento) throws Exception{
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_cargo,_salario,_departamento}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre,_cargo,_salario,_departamento);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.empleados parent,b4a.example.empleados __ref,int _id,String _nombre,String _cargo,double _salario,String _departamento) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._cargo = _cargo;
this._salario = _salario;
this._departamento = _departamento;
this.__ref = parent;
}
b4a.example.empleados __ref;
b4a.example.empleados parent;
int _id;
String _nombre;
String _cargo;
double _salario;
String _departamento;
b4a.example.empleado _clase = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="empleados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim clase As Empleado";
_clase = new b4a.example.empleado();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="clase.Initialize()";
_clase._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="json = \"{\"\"id\"\": \" & id & \", \"\"nombre\"\": \"\"\" & No";
_json = "{\"id\": "+BA.NumberToString(_id)+", \"nombre\": \""+_nombre+"\", \"cargo\": \""+_cargo+"\", \"salario\": "+BA.NumberToString(_salario)+", \"departamento\": \""+_departamento+"\"}";
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "empleados", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.empleados __ref,int _id) throws Exception{
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.empleados parent,b4a.example.empleados __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.empleados __ref;
b4a.example.empleados parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="empleados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "empleados", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.empleados __ref,int _id,String _nombre,String _cargo,double _salario,String _departamento) throws Exception{
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_cargo,_salario,_departamento}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre,_cargo,_salario,_departamento);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.empleados parent,b4a.example.empleados __ref,int _id,String _nombre,String _cargo,double _salario,String _departamento) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._cargo = _cargo;
this._salario = _salario;
this._departamento = _departamento;
this.__ref = parent;
}
b4a.example.empleados __ref;
b4a.example.empleados parent;
int _id;
String _nombre;
String _cargo;
double _salario;
String _departamento;
b4a.example.empleado _clase = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="empleados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim clase As Empleado";
_clase = new b4a.example.empleado();
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="clase.Initialize()";
_clase._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="json = \"{'id':0, 'nombre': '\" & Nombre & \"', 'car";
_json = "{'id':0, 'nombre': '"+_nombre+"', 'cargo': '"+_cargo+"', 'salario': "+BA.NumberToString(_salario)+", 'departamento': '"+_departamento+"'}";
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13500426;
 //BA.debugLineNum = 13500426;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=13500427;
 //BA.debugLineNum = 13500427;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "empleados", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13500429;
 //BA.debugLineNum = 13500429;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13500430;
 //BA.debugLineNum = 13500430;BA.debugLine="jsonParser.Initialize( resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=13500432;
 //BA.debugLineNum = 13500432;BA.debugLine="clase.Id = data.Get(\"id\")";
_clase._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=13500433;
 //BA.debugLineNum = 13500433;BA.debugLine="clase.Nombre=data.Get(\"nombre\")";
_clase._nombre /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre")));
RDebugUtils.currentLine=13500434;
 //BA.debugLineNum = 13500434;BA.debugLine="clase.Cargo=data.Get(\"cargo\")";
_clase._cargo /*String*/  = BA.ObjectToString(_data.Get((Object)("cargo")));
RDebugUtils.currentLine=13500435;
 //BA.debugLineNum = 13500435;BA.debugLine="clase.Salario=data.Get(\"salario\")";
_clase._salario /*double*/  = (double)(BA.ObjectToNumber(_data.Get((Object)("salario"))));
RDebugUtils.currentLine=13500436;
 //BA.debugLineNum = 13500436;BA.debugLine="clase.Departamento=data.Get(\"departamento\")";
_clase._departamento /*String*/  = BA.ObjectToString(_data.Get((Object)("departamento")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13500438;
 //BA.debugLineNum = 13500438;BA.debugLine="Return clase";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clase));return;};
RDebugUtils.currentLine=13500439;
 //BA.debugLineNum = 13500439;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.empleados __ref,int _id) throws Exception{
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.empleados parent,b4a.example.empleados __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.empleados __ref;
b4a.example.empleados parent;
int _id;
b4a.example.empleado _clase = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="empleados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim clase As Empleado";
_clase = new b4a.example.empleado();
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="clase.Initialize";
_clase._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="apiJob.Download(apiURL &\"/\"& id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "empleados", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="clase.Id = map.Get(\"id\")";
_clase._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="clase.Nombre = map.Get(\"nombre\")";
_clase._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="clase.Cargo=map.Get(\"cargo\")";
_clase._cargo /*String*/  = BA.ObjectToString(_map.Get((Object)("cargo")));
RDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="clase.Salario = map.Get(\"salario\")";
_clase._salario /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("salario"))));
RDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="clase.Departamento=map.Get(\"departamento\")";
_clase._departamento /*String*/  = BA.ObjectToString(_map.Get((Object)("departamento")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="Return clase";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clase));return;};
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.empleados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleados";
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.empleados __ref) throws Exception{
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.empleados parent,b4a.example.empleados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.empleados __ref;
b4a.example.empleados parent;
anywheresoftware.b4a.objects.collections.List _c1 = null;
b4a.example.empleado _c2 = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lista = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="empleados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim c1 As List";
_c1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim c2 As Empleado";
_c2 = new b4a.example.empleado();
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="c1.Initialize";
_c1.Initialize();
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="c2.Initialize";
_c2._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14680074;
 //BA.debugLineNum = 14680074;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=14680075;
 //BA.debugLineNum = 14680075;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "empleados", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14680076;
 //BA.debugLineNum = 14680076;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14680077;
 //BA.debugLineNum = 14680077;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14680078;
 //BA.debugLineNum = 14680078;BA.debugLine="lista = jsonParser.NextArray";
_lista = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=14680079;
 //BA.debugLineNum = 14680079;BA.debugLine="For i = 0 To lista.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step13 = 1;
limit13 = (int) (_lista.getSize()-1);
_i = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=14680080;
 //BA.debugLineNum = 14680080;BA.debugLine="map = lista.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lista.Get(_i)));
RDebugUtils.currentLine=14680081;
 //BA.debugLineNum = 14680081;BA.debugLine="Dim c2 As Empleado";
_c2 = new b4a.example.empleado();
RDebugUtils.currentLine=14680082;
 //BA.debugLineNum = 14680082;BA.debugLine="c2.Initialize";
_c2._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14680083;
 //BA.debugLineNum = 14680083;BA.debugLine="c2.Id = map.Get(\"id\")";
_c2._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=14680084;
 //BA.debugLineNum = 14680084;BA.debugLine="c2.Nombre = map.Get(\"nombre\")";
_c2._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=14680085;
 //BA.debugLineNum = 14680085;BA.debugLine="c2.Cargo=map.Get(\"cargo\")";
_c2._cargo /*String*/  = BA.ObjectToString(_map.Get((Object)("cargo")));
RDebugUtils.currentLine=14680086;
 //BA.debugLineNum = 14680086;BA.debugLine="c2.Salario = map.Get(\"salario\")";
_c2._salario /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("salario"))));
RDebugUtils.currentLine=14680087;
 //BA.debugLineNum = 14680087;BA.debugLine="c2.Departamento=map.Get(\"departamento\")";
_c2._departamento /*String*/  = BA.ObjectToString(_map.Get((Object)("departamento")));
RDebugUtils.currentLine=14680088;
 //BA.debugLineNum = 14680088;BA.debugLine="c1.Add(c2)";
_c1.Add((Object)(_c2));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=14680092;
 //BA.debugLineNum = 14680092;BA.debugLine="Return c1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_c1));return;};
RDebugUtils.currentLine=14680093;
 //BA.debugLineNum = 14680093;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}