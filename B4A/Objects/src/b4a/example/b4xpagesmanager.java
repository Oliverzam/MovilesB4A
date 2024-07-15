package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpagesmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xpagesmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xpagesmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xpageparent{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.ActivityWrapper NativeType;
public anywheresoftware.b4a.objects.collections.List MenuItems;
public void Initialize() {
IsInitialized = true;
NativeType = new anywheresoftware.b4a.objects.ActivityWrapper();
MenuItems = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4amenuitem{
public boolean IsInitialized;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Bitmap;
public String Tag;
public boolean AddToBar;
public anywheresoftware.b4j.object.JavaObject NativeMenuItem;
public void Initialize() {
IsInitialized = true;
Title = new Object();
Bitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Tag = "";
AddToBar = false;
NativeMenuItem = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xpageinfo{
public boolean IsInitialized;
public Object B4XPage;
public String Id;
public boolean Created;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper Root;
public boolean IsFirst;
public b4a.example.b4xpagesmanager._b4xpageparent Parent;
public void Initialize() {
IsInitialized = true;
B4XPage = new Object();
Id = "";
Created = false;
Title = new Object();
Root = new anywheresoftware.b4a.objects.B4XViewWrapper();
IsFirst = false;
Parent = new b4a.example.b4xpagesmanager._b4xpageparent();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.b4xorderedmap _idtob4xpage = null;
public b4a.example.b4xorderedmap _rootb4xtopage = null;
public anywheresoftware.b4j.object.JavaObject _context = null;
public b4a.example.b4xset _mstackofpageids = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ActivityWrapper _mmainform = null;
public boolean _showupindicator = false;
public anywheresoftware.b4j.object.JavaObject _actionbar = null;
public boolean _isforeground = false;
public int _transitionanimationduration = 0;
public b4a.example.b4xmainpage _mainpage = null;
public String _stackstring = "";
public boolean _logevents = false;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.b4xpagesmanager __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _module = null;
boolean _nonmainpagewasadded = false;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Initialize (Activity As Activity)";
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="IdToB4XPage.Initialize";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="RootB4XToPage.Initialize";
__ref._rootb4xtopage /*b4a.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="mStackOfPageIds.Initialize";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="Context.InitializeContext";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .InitializeContext(ba);
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="mMainForm = Activity";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activity;
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="CheckMainActivityOrientations";
__ref._checkmainactivityorientations /*String*/ (null);
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="Dim module As JavaObject";
_module = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="module.InitializeStatic(jo.RunMethodJO(\"getActivi";
_module.InitializeStatic(BA.ObjectToString(_jo.RunMethodJO("getActivityBA",(Object[])(__c.Null)).GetField("className"))).SetField("dontPause",(Object)(__c.True));
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (ba,this);
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="MainPage.Initialize";
__ref._mainpage /*b4a.example.b4xmainpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)("~~~~~temp~~~~"),(Object)(__ref._createb4xpageinfo /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,(Object)(__ref._mainpage /*b4a.example.b4xmainpage*/ ),"",__c.False,(Object)(""))));
RDebugUtils.currentLine=8519703;
 //BA.debugLineNum = 8519703;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)("~~~~~temp~~~~"));
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
__ref._addpageandcreate /*String*/ (null,"MainPage",(Object)(__ref._mainpage /*b4a.example.b4xmainpage*/ ));
RDebugUtils.currentLine=8519706;
 //BA.debugLineNum = 8519706;BA.debugLine="If LogEvents = False Then";
if (__ref._logevents /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("98519707","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
RDebugUtils.currentLine=8519709;
 //BA.debugLineNum = 8519709;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
RDebugUtils.currentLine=8519710;
 //BA.debugLineNum = 8519710;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=8519714;
 //BA.debugLineNum = 8519714;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4amenuitem  _addmenuitem(b4a.example.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addmenuitem", true))
	 {return ((b4a.example.b4xpagesmanager._b4amenuitem) Debug.delegate(ba, "addmenuitem", new Object[] {_b4xpage,_title}));}
b4a.example.b4xpagesmanager._b4amenuitem _mi = null;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub AddMenuItem (B4XPage As Object, Title A";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim mi As B4AMenuItem";
_mi = new b4a.example.b4xpagesmanager._b4amenuitem();
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="mi.Initialize";
_mi.Initialize();
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="mi.Title = Title";
_mi.Title /*Object*/  = _title;
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="mi.Tag = Title";
_mi.Tag /*String*/  = BA.ObjectToString(_title);
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="FindPIFromB4XPage(B4XPage).Parent.MenuItems.Add(m";
__ref._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mi));
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Return mi";
if (true) return _mi;
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="End Sub";
return null;
}
public String  _addpage(b4a.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
String _idtolower = "";
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_idtolower))) { 
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("98716291",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_idtolower),(Object)(__ref._createb4xpageinfo /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage,_idtolower,__c.False,(Object)(_id))));
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1) { 
__ref._showpage /*String*/ (null,_idtolower);};
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(b4a.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="AddPage (Id, B4XPage)";
__ref._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
__ref._createpageifneeded /*String*/ (null,__ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="End Sub";
return "";
}
public String  _closepage(b4a.example.b4xpagesmanager __ref,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && (__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi) == false) { 
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("98978436","Only top page can be closed",0);
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && __ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("98978439","First page cannot be closed",0);
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi);
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="ClosePageImpl(pi)";
__ref._closepageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
 };
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
if (true) return "";};
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=8978450;
 //BA.debugLineNum = 8978450;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._showpageimpl /*String*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null));};
RDebugUtils.currentLine=8978451;
 //BA.debugLineNum = 8978451;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
 };
RDebugUtils.currentLine=8978453;
 //BA.debugLineNum = 8978453;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(b4a.example.b4xpagesmanager __ref,Object _page) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "findpifromb4xpage", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "findpifromb4xpage", new Object[] {_page}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4a.example.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="Return Null";
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__c.Null);
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id).B4XPage /*Object*/ ;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4a.example.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.b4xpagesmanager._b4xpageinfo _top = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null))) { 
if (true) return "";};
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Dim Top As B4XPageInfo = GetTopPage";
_top = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="If Top <> Null Then";
if (_top!= null) { 
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="Top.Root.RemoveViewFromParent";
_top.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=8847378;
 //BA.debugLineNum = 8847378;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=8847379;
 //BA.debugLineNum = 8847379;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=8847381;
 //BA.debugLineNum = 8847381;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=8847382;
 //BA.debugLineNum = 8847382;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="If GetTopPage = Null Then";
if (__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null)== null) { 
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="ShowPage(Id)";
__ref._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._mstackofpageids /*b4a.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = __ref._getpagefromid /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="PageToRemove.Root.RemoveViewFromParent";
_pagetoremove.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=8912917;
 //BA.debugLineNum = 8912917;BA.debugLine="mStackOfPageIds.Clear";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=8912918;
 //BA.debugLineNum = 8912918;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=8912919;
 //BA.debugLineNum = 8912919;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=8912920;
 //BA.debugLineNum = 8912920;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=8912922;
 //BA.debugLineNum = 8912922;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=8912923;
 //BA.debugLineNum = 8912923;BA.debugLine="End Sub";
return "";
}
public String  _activity_actionbarhomeclick(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_actionbarhomeclick", true))
	 {return ((String) Debug.delegate(ba, "activity_actionbarhomeclick", null));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="If pi <> Null Then";
if (_pi!= null) { 
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="If CloseRequestExists (pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
 };
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="End Sub";
return "";
}
public boolean  _activity_keypress(b4a.example.b4xpagesmanager __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_keypress", true))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="If CloseRequestExists(pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="End Sub";
return false;
}
public String  _activity_pause(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
__ref._raiseeventwithresult /*Object*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=10223630;
 //BA.debugLineNum = 10223630;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("910223630","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=10223632;
 //BA.debugLineNum = 10223632;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _gettoppage(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "gettoppage", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "gettoppage", null));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__c.Null);};
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mstackofpageids /*b4a.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)-1))));
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="End Sub";
return null;
}
public String  _activity_resume(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
boolean _shouldraise = false;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref._isforeground /*boolean*/ ==__c.False;
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="End Sub";
return "";
}
public String  _createmenu(b4a.example.b4xpagesmanager __ref,Object _menu) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createmenu", true))
	 {return ((String) Debug.delegate(ba, "createmenu", new Object[] {_menu}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
b4a.example.b4xpagesmanager._b4amenuitem _mi = null;
anywheresoftware.b4j.object.JavaObject _nativemenuitem = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4j.object.JavaObject _listener = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub CreateMenu (Menu As Object)";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Dim jo As JavaObject = Menu";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_menu));
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="For Each mi As B4AMenuItem In pi.Parent.MenuItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mi = (b4a.example.b4xpagesmanager._b4amenuitem)(group4.Get(index4));
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Dim NativeMenuItem As JavaObject = jo.RunMethod(";
_nativemenuitem = new anywheresoftware.b4j.object.JavaObject();
_nativemenuitem = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("add",new Object[]{_mi.Title /*Object*/ })));
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="If mi.Bitmap.IsInitialized Then";
if (_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="bd.Initialize(mi.Bitmap)";
_bd.Initialize((android.graphics.Bitmap)(_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="NativeMenuItem.RunMethod(\"setIcon\", Array(bd))";
_nativemenuitem.RunMethod("setIcon",new Object[]{(Object)(_bd.getObject())});
 };
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="If mi.AddToBar Then";
if (_mi.AddToBar /*boolean*/ ) { 
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="NativeMenuItem.RunMethod(\"setShowAsAction\", Arr";
_nativemenuitem.RunMethod("setShowAsAction",new Object[]{(Object)(1)});
 };
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="Dim listener As JavaObject";
_listener = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="listener.InitializeNewInstance(Application.Packa";
_listener.InitializeNewInstance(__c.Application.getPackageName()+".b4xpagesmanager$PagesMenuListener",new Object[]{_pi.B4XPage /*Object*/ ,(Object)(_mi.Tag /*String*/ )});
RDebugUtils.currentLine=10027024;
 //BA.debugLineNum = 10027024;BA.debugLine="NativeMenuItem.RunMethod(\"setOnMenuItemClickList";
_nativemenuitem.RunMethod("setOnMenuItemClickListener",new Object[]{(Object)(_listener.getObject())});
 }
};
RDebugUtils.currentLine=10027026;
 //BA.debugLineNum = 10027026;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4a.example.b4xpagesmanager __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
__ref._raiseevent /*String*/ (null,__ref._getpageinfofromroot /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closerequestexists", true))
	 {return ((Boolean) Debug.delegate(ba, "closerequestexists", new Object[] {_pi}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return false;
}
public void  _handlecloserequest(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "handlecloserequest", true))
	 {Debug.delegate(ba, "handlecloserequest", new Object[] {_pi}); return;}
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(this,__ref,_pi);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(b4a.example.b4xpagesmanager parent,b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) {
this.parent = parent;
this.__ref = __ref;
this._pi = _pi;
this.__ref = parent;
}
b4a.example.b4xpagesmanager __ref;
b4a.example.b4xpagesmanager parent;
b4a.example.b4xpagesmanager._b4xpageinfo _pi;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _shouldclose = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_CloseRequest");
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubDebug(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (Boolean) result[1];
;
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="If ShouldClose Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _raiseeventwithresult(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseeventwithresult", true))
	 {return ((Object) Debug.delegate(ba, "raiseeventwithresult", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("910289166","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=10289169;
 //BA.debugLineNum = 10289169;BA.debugLine="End Sub";
return null;
}
public String  _backgroundstatechanged(b4a.example.b4xpagesmanager __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "backgroundstatechanged", true))
	 {return ((String) Debug.delegate(ba, "backgroundstatechanged", new Object[] {_newstate}));}
String _ev = "";
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref._isforeground /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="IsForeground = NewState";
__ref._isforeground /*boolean*/  = _newstate;
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Dim ev As String";
_ev = "";
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref._isforeground /*boolean*/ ) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (b4a.example.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="LogEvent(pi, ev)";
__ref._logevent /*String*/ (null,_pi,_ev);
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(b4a.example.b4xpagesmanager __ref,Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageinfo", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "createb4xpageinfo", new Object[] {_b4xpage,_id,_created,_title}));}
b4a.example.b4xpagesmanager._b4xpageinfo _t1 = null;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new b4a.example.b4xpagesmanager._b4xpageinfo();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageifneeded", true))
	 {return ((String) Debug.delegate(ba, "createpageifneeded", new Object[] {_pi}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = __ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1;
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="CreatePageImpl (pi)";
__ref._createpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
__ref._rootb4xtopage /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_Created");
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubDebug2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _getpagefromid(b4a.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpagefromid", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpagefromid", new Object[] {_id}));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (b4a.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_id.toLowerCase())));
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("99633795","Error: page id not found: "+_id,0);
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("99633796","Ids: "+BA.ObjectToString(__ref._idtob4xpage /*b4a.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)),0);
 };
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="End Sub";
return null;
}
public String  _logevent(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "logevent", true))
	 {return ((String) Debug.delegate(ba, "logevent", new Object[] {_pi,_ev}));}
String _msg = "";
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="If LogEvents Then";
if (__ref._logevents /*boolean*/ ) { 
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(__ref._stackstring /*String*/ ))+"");
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Log(msg)";
__c.LogImpl("910747907",_msg,0);
 };
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="End Sub";
return "";
}
public String  _checkmainactivityorientations(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "checkmainactivityorientations", true))
	 {return ((String) Debug.delegate(ba, "checkmainactivityorientations", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _jme = null;
boolean _isappcompat = false;
anywheresoftware.b4j.object.JavaObject _pi = null;
Object[] _activities = null;
anywheresoftware.b4j.object.JavaObject _act = null;
String _name = "";
int _screenorientation = 0;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub CheckMainActivityOrientations";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="ActionBar = jo.RunMethod(\"getActionBar\", Null)";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getActionBar",(Object[])(__c.Null))));
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="If ActionBar.IsInitialized = False Then";
if (__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="Dim jme As JavaObject = Me";
_jme = new anywheresoftware.b4j.object.JavaObject();
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="Dim IsAppCompat As Boolean = jme.RunMethod(\"chec";
_isappcompat = BA.ObjectToBoolean(_jme.RunMethod("checkIfAppCompat",new Object[]{(Object)(_jo.getObject())}));
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="If IsAppCompat Then";
if (_isappcompat) { 
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="ActionBar = jo.RunMethod(\"getSupportActionBar\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getSupportActionBar",(Object[])(__c.Null))));
 };
 };
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="Dim pi As JavaObject = jo.RunMethodJO(\"getPackage";
_pi = new anywheresoftware.b4j.object.JavaObject();
_pi = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethodJO("getPackageManager",(Object[])(__c.Null)).RunMethod("getPackageInfo",new Object[]{(Object)(__c.Application.getPackageName()),(Object)(1)})));
RDebugUtils.currentLine=8585231;
 //BA.debugLineNum = 8585231;BA.debugLine="Dim activities() As Object = pi.GetField(\"activit";
_activities = (Object[])(_pi.GetField("activities"));
RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="For Each Act As JavaObject In activities";
_act = new anywheresoftware.b4j.object.JavaObject();
{
final Object[] group13 = _activities;
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_act = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group13[index13]));
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="Dim name As String = Act.GetField(\"name\")";
_name = BA.ObjectToString(_act.GetField("name"));
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="If name.EndsWith(\".main\") Then";
if (_name.endsWith(".main")) { 
RDebugUtils.currentLine=8585235;
 //BA.debugLineNum = 8585235;BA.debugLine="Dim screenOrientation As Int = Act.GetField(\"sc";
_screenorientation = (int)(BA.ObjectToNumber(_act.GetField("screenOrientation")));
RDebugUtils.currentLine=8585236;
 //BA.debugLineNum = 8585236;BA.debugLine="If screenOrientation = -1 Then";
if (_screenorientation==-1) { 
RDebugUtils.currentLine=8585237;
 //BA.debugLineNum = 8585237;BA.debugLine="LogColor(\"#SupportedOrientations attribute mus";
__c.LogImpl("98585237","#SupportedOrientations attribute must be set to landscape or portrait.",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
 };
 };
 }
};
RDebugUtils.currentLine=8585241;
 //BA.debugLineNum = 8585241;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Private Context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Type B4XPageParent (NativeType As Activity, MenuI";
;
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Type B4AMenuItem (Title As Object, Bitmap As B4XB";
;
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new b4a.example.b4xset();
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8454165;
 //BA.debugLineNum = 8454165;BA.debugLine="Private mMainForm As Activity";
_mmainform = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=8454166;
 //BA.debugLineNum = 8454166;BA.debugLine="Public ShowUpIndicator As Boolean = True";
_showupindicator = __c.True;
RDebugUtils.currentLine=8454167;
 //BA.debugLineNum = 8454167;BA.debugLine="Public ActionBar As JavaObject";
_actionbar = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8454171;
 //BA.debugLineNum = 8454171;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
RDebugUtils.currentLine=8454172;
 //BA.debugLineNum = 8454172;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
RDebugUtils.currentLine=8454173;
 //BA.debugLineNum = 8454173;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new b4a.example.b4xmainpage();
RDebugUtils.currentLine=8454174;
 //BA.debugLineNum = 8454174;BA.debugLine="Private StackString As String";
_stackstring = "";
RDebugUtils.currentLine=8454175;
 //BA.debugLineNum = 8454175;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
RDebugUtils.currentLine=8454176;
 //BA.debugLineNum = 8454176;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepageimpl", true))
	 {return ((String) Debug.delegate(ba, "closepageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="If mStackOfPageIds.Size = 1 Then";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="i.Initialize(i.ACTION_MAIN, \"\")";
_i.Initialize(_i.ACTION_MAIN,"");
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="i.AddCategory(\"android.intent.category.HOME\")";
_i.AddCategory("android.intent.category.HOME");
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="i.Flags = 0x10000000";
_i.setFlags(((int)0x10000000));
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 }else {
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="pi.Root.RemoveViewFromParent";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=9240592;
 //BA.debugLineNum = 9240592;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppagedisappear", true))
	 {return ((String) Debug.delegate(ba, "toppagedisappear", null));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub TopPageDisappear";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="If xui.IsB4J Then Return";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
if (true) return "";};
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageimpl", true))
	 {return ((String) Debug.delegate(ba, "showpageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="If pi.Root.Parent.IsInitialized Then pi.Root.Remo";
if (_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="Dim pnl As Panel = pi.Root";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="If TransitionAnimationDuration > 0 Then";
if (__ref._transitionanimationduration /*int*/ >0) { 
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 20dip, 20dip)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="pnl.SetLayoutAnimated(TransitionAnimationDuratio";
_pnl.SetLayoutAnimated(__ref._transitionanimationduration /*int*/ ,(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
RDebugUtils.currentLine=9306124;
 //BA.debugLineNum = 9306124;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 100%x, 100%y)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=9306129;
 //BA.debugLineNum = 9306129;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppageappear", true))
	 {return ((String) Debug.delegate(ba, "toppageappear", null));}
b4a.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub TopPageAppear";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="If ShowUpIndicator And ActionBar.IsInitialized Th";
if (__ref._showupindicator /*boolean*/  && __ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="ActionBar.RunMethod(\"setDisplayHomeAsUpEnabled\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)>1)});
 };
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="UpdateMenuItems";
__ref._updatemenuitems /*String*/ (null);
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageparent  _createb4xpageparent(b4a.example.b4xpagesmanager __ref,Object _nativetype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageparent", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageparent) Debug.delegate(ba, "createb4xpageparent", new Object[] {_nativetype}));}
b4a.example.b4xpagesmanager._b4xpageparent _t1 = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Obj";
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new b4a.example.b4xpagesmanager._b4xpageparent();
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/  = (anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_nativetype));
RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="End Sub";
return null;
}
public String  _createpageimpl(b4a.example.b4xpagesmanager __ref,b4a.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageimpl", true))
	 {return ((String) Debug.delegate(ba, "createpageimpl", new Object[] {_pi}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="pi.Root = xui.CreatePanel(\"root\")";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"root");
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="pi.root.SetLayoutAnimated(0, 0, 0, 100%x, 100%y)";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4a.example.b4xpagesmanager._b4xpageparent*/ (null,(Object)(__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .getObject()));
RDebugUtils.currentLine=9502735;
 //BA.debugLineNum = 9502735;BA.debugLine="pi.Parent.MenuItems.Initialize";
_pi.Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9502743;
 //BA.debugLineNum = 9502743;BA.debugLine="End Sub";
return "";
}
public b4a.example.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(b4a.example.b4xpagesmanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpageinfofromroot", true))
	 {return ((b4a.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpageinfofromroot", new Object[] {_root}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (b4a.example.b4xpagesmanager._b4xpageinfo)(__ref._rootb4xtopage /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_root.getObject())));
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return null;
}
public String  _updatemenuitems(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatemenuitems", true))
	 {return ((String) Debug.delegate(ba, "updatemenuitems", null));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub UpdateMenuItems";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Context.RunMethod(\"invalidateOptionsMenu\", Null)";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("invalidateOptionsMenu",(Object[])(__c.Null));
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="End Sub";
return "";
}
public String  _updatestackstring(b4a.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatestackstring", true))
	 {return ((String) Debug.delegate(ba, "updatestackstring", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub UpdateStackString";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (__ref._mstackofpageids /*b4a.example.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mstackofpageids /*b4a.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="StackString = sb.ToString";
__ref._stackstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="End Sub";
return "";
}
public boolean checkIfAppCompat(android.app.Activity act) {
	return act.getClass().getSuperclass().getName().equals("androidx.appcompat.app.AppCompatActivity");
}
public static class PagesMenuListener implements android.view.MenuItem.OnMenuItemClickListener {
	private B4AClass target;
	private String tag;
	public PagesMenuListener(B4AClass target, String tag) {
		this.target = target;
		this.tag = tag;
	}
 	public boolean onMenuItemClick(android.view.MenuItem item) {
		target.getBA().raiseEventFromUI(null, "b4xpage_menuclick", tag);
		return true;
	}
}
}